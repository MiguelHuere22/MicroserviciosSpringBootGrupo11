package sm.dsw.ms.people.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sm.dsw.ms.people.dto.UbigeoWithPeopleResponse;
import sm.dsw.ms.people.model.People;
import sm.dsw.ms.people.repository.PeopleRepository;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${ubigeo.service.url}")
    private String ubigeoServiceUrl;

    @Override
    public List<People> getAllPersonas() {
        return peopleRepository.findAll();
    }

    @Override
    public People getPersonaById(Long id) {
        return peopleRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona not found"));
    }

    @Override
    public People createPersona(People persona) {
        return peopleRepository.save(persona);
    }

    @Override
    public People updatePersona(Long id, People personaDetails) {
        People persona = peopleRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona not found"));
        persona.setApellidos(personaDetails.getApellidos());
        persona.setNombres(personaDetails.getNombres());
        persona.setSexo(personaDetails.getSexo());
        persona.setTelefono(personaDetails.getTelefono());
        persona.setFechaNacimiento(personaDetails.getFechaNacimiento());
        persona.setIdUbigeo(personaDetails.getIdUbigeo());
        return peopleRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        People persona = peopleRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona not found"));
        peopleRepository.delete(persona);
    }

    @Override
    public List<People> findByIdUbigeo(Long idUbigeo) {
        return peopleRepository.findByIdUbigeo(idUbigeo);
    }

    @Override
    public UbigeoWithPeopleResponse getUbigeoWithPersonas(Long idUbigeo) {
        String url = ubigeoServiceUrl + "/" + idUbigeo;
        UbigeoWithPeopleResponse ubigeo = restTemplate.getForObject(url, UbigeoWithPeopleResponse.class);
        List<People> personas = peopleRepository.findByIdUbigeo(idUbigeo);
        ubigeo.setPersonas(personas);
        return ubigeo;
    }
}
