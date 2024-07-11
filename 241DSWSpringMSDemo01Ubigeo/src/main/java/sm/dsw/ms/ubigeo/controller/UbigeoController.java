package sm.dsw.ms.ubigeo.controller;

import sm.dsw.ms.ubigeo.model.Ubigeo;
import sm.dsw.ms.ubigeo.service.UbigeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ubigeos")
public class UbigeoController {

    @Autowired
    private UbigeoService ubigeoService;

    @GetMapping
    public List<Ubigeo> getAllUbigeos() {
        return ubigeoService.getAllUbigeos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ubigeo> getUbigeoById(@PathVariable Long id) {
        Ubigeo ubigeo = ubigeoService.getUbigeoById(id);
        return ResponseEntity.ok(ubigeo);
    }

    @PostMapping
    public Ubigeo createUbigeo(@RequestBody Ubigeo ubigeo) {
        return ubigeoService.createUbigeo(ubigeo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ubigeo> updateUbigeo(@PathVariable Long id, @RequestBody Ubigeo ubigeoDetails) {
        Ubigeo ubigeo = ubigeoService.updateUbigeo(id, ubigeoDetails);
        return ResponseEntity.ok(ubigeo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUbigeo(@PathVariable Long id) {
        ubigeoService.deleteUbigeo(id);
        return ResponseEntity.noContent().build();
    }
}
