package sm.dsw.ms.people.service;

import sm.dsw.ms.people.model.People;
import sm.dsw.ms.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository personaRepository;

    @Override
    public List<People> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public People getPersonaById(Long id) {
        return personaRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona not found"));
    }

    @Override
    public People createPersona(People persona) {
        return personaRepository.save(persona);
    }

    @Override
    public People updatePersona(Long id, People personaDetails) {
        People persona = personaRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona not found"));
        persona.setApellidos(personaDetails.getApellidos());
        persona.setNombres(personaDetails.getNombres());
        persona.setSexo(personaDetails.getSexo());
        persona.setTelefono(personaDetails.getTelefono());
        persona.setFechaNacimiento(personaDetails.getFechaNacimiento());
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        People persona = personaRepository.findById(id).orElseThrow(() -> new RuntimeException("Persona not found"));
        personaRepository.delete(persona);
    }
}
