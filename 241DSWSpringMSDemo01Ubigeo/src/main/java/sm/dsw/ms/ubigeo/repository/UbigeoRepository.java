package sm.dsw.ms.ubigeo.repository;

import sm.dsw.ms.ubigeo.model.Ubigeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, Long> {
}
