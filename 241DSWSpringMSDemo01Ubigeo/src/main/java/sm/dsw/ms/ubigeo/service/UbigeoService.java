package sm.dsw.ms.ubigeo.service;

import sm.dsw.ms.ubigeo.model.Ubigeo;
import java.util.List;

public interface UbigeoService {
    List<Ubigeo> getAllUbigeos();
    Ubigeo getUbigeoById(Long id);
    Ubigeo createUbigeo(Ubigeo ubigeo);
    Ubigeo updateUbigeo(Long id, Ubigeo ubigeoDetails);
    void deleteUbigeo(Long id);
}
