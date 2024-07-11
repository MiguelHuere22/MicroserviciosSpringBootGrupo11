package sm.dsw.ms.people.repository;

import sm.dsw.ms.people.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {
    List<People> findByIdUbigeo(Long idUbigeo);
}
