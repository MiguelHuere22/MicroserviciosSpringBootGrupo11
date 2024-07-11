package sm.dsw.ms.ubigeo.service;

import sm.dsw.ms.ubigeo.model.Ubigeo;
import sm.dsw.ms.ubigeo.repository.UbigeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UbigeoServiceImpl implements UbigeoService {

    @Autowired
    private UbigeoRepository ubigeoRepository;

    @Override
    public List<Ubigeo> getAllUbigeos() {
        return ubigeoRepository.findAll();
    }

    @Override
    public Ubigeo getUbigeoById(Long id) {
        return ubigeoRepository.findById(id).orElseThrow(() -> new RuntimeException("Ubigeo not found"));
    }

    @Override
    public Ubigeo createUbigeo(Ubigeo ubigeo) {
        return ubigeoRepository.save(ubigeo);
    }

    @Override
    public Ubigeo updateUbigeo(Long id, Ubigeo ubigeoDetails) {
        Ubigeo ubigeo = ubigeoRepository.findById(id).orElseThrow(() -> new RuntimeException("Ubigeo not found"));
        ubigeo.setDepartamento(ubigeoDetails.getDepartamento());
        ubigeo.setProvincia(ubigeoDetails.getProvincia());
        ubigeo.setDistrito(ubigeoDetails.getDistrito());
        ubigeo.setSuperficie(ubigeoDetails.getSuperficie());
        ubigeo.setAltitud(ubigeoDetails.getAltitud());
        ubigeo.setLatitud(ubigeoDetails.getLatitud());
        ubigeo.setLongitud(ubigeoDetails.getLongitud());
        return ubigeoRepository.save(ubigeo);
    }

    @Override
    public void deleteUbigeo(Long id) {
        Ubigeo ubigeo = ubigeoRepository.findById(id).orElseThrow(() -> new RuntimeException("Ubigeo not found"));
        ubigeoRepository.delete(ubigeo);
    }
}
