package ar.com.ale94.manage_decrees.controllers;

import ar.com.ale94.manage_decrees.entities.DecreeEntity;
import ar.com.ale94.manage_decrees.services.IDecreeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DecreeController {

    private final IDecreeService service;

    @GetMapping
    public ResponseEntity<List<DecreeEntity>> get() {
        return ResponseEntity.ok(service.getAll());
    }
}
