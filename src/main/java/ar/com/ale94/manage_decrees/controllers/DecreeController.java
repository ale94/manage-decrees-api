package ar.com.ale94.manage_decrees.controllers;

import ar.com.ale94.manage_decrees.dto.DecreeDTO;
import ar.com.ale94.manage_decrees.entities.DecreeEntity;
import ar.com.ale94.manage_decrees.services.IDecreeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DecreeController {

    private final IDecreeService service;

    @GetMapping
    public ResponseEntity<List<DecreeEntity>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping(path = "/{number}")
    public ResponseEntity<DecreeEntity> getByNumber(@PathVariable String number) {
        var decree = service.getByNumber(number);
        if (decree == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(decree);
    }

    @PostMapping
    public ResponseEntity<DecreeEntity> post(@RequestBody DecreeDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @DeleteMapping(path = "/{number}")
    public ResponseEntity<Void> delete(@PathVariable String number) {
        service.delete(number);
        return ResponseEntity.noContent().build();
    }
}
