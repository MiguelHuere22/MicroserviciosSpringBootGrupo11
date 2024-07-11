package sm.dsw.ms.people.service;

import sm.dsw.ms.people.model.People;
import java.util.List;

public interface PeopleService {
    List<People> getAllPersonas();
    People getPersonaById(Long id);
    People createPersona(People persona);
    People updatePersona(Long id, People personaDetails);
    void deletePersona(Long id);
}
