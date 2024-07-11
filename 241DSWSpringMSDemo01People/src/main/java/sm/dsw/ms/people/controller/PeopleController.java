package sm.dsw.ms.people.controller;

import sm.dsw.ms.people.dto.UbigeoWithPeopleResponse;
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
    private PeopleService peopleService;

    @GetMapping
    public List<People> getAllPersonas() {
        return peopleService.getAllPersonas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<People> getPersonaById(@PathVariable Long id) {
        People persona = peopleService.getPersonaById(id);
        return ResponseEntity.ok(persona);
    }

    @PostMapping
    public People createPersona(@RequestBody People persona) {
        return peopleService.createPersona(persona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<People> updatePersona(@PathVariable Long id, @RequestBody People personaDetails) {
        People persona = peopleService.updatePersona(id, personaDetails);
        return ResponseEntity.ok(persona);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id) {
        peopleService.deletePersona(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/ubigeo/{idUbigeo}")
    public ResponseEntity<UbigeoWithPeopleResponse> getUbigeoWithPersonas(@PathVariable Long idUbigeo) {
        UbigeoWithPeopleResponse response = peopleService.getUbigeoWithPersonas(idUbigeo);
        return ResponseEntity.ok(response);
    }
}
