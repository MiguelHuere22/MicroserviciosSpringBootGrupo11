package sm.dsw.ms.people.controller;

import sm.dsw.ms.people.model.People;
import sm.dsw.ms.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PeopleController {

    @Autowired
    private PeopleService personaService;

    @GetMapping
    public List<People> getAllPersonas() {
        return personaService.getAllPersonas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<People> getPersonaById(@PathVariable Long id) {
        People persona = personaService.getPersonaById(id);
        return ResponseEntity.ok(persona);
    }

    @PostMapping
    public People createPersona(@RequestBody People persona) {
        return personaService.createPersona(persona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<People> updatePersona(@PathVariable Long id, @RequestBody People personaDetails) {
        People persona = personaService.updatePersona(id, personaDetails);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id) {
        personaService.deletePersona(id);
        return ResponseEntity.noContent().build();
    }
}
