package com.example.demo.controller;

import com.example.demo.model.Coleta;
import com.example.demo.repository.ColetaRepository;
import com.example.demo.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/coletas")
public class ColetaController {

    @Autowired
    private ColetaService coletaService;

    @GetMapping
    public ResponseEntity<List<Coleta>> getColetas() {
        var coletas = coletaService.getAllColetas();
        return ResponseEntity.ok().body(coletas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coleta> getColeta(@PathVariable Long id) {
        var coleta = coletaService.getColeta(id);
        return ResponseEntity.ok().body(coleta);
    }

    @PostMapping
    public ResponseEntity<Coleta> createColeta(@RequestBody Coleta coleta) {
        var obj = coletaService.addColeta(coleta);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    public ResponseEntity<Void> deleteColeta(@PathVariable Long id) {
        coletaService.delColeta(id);
        return ResponseEntity.noContent().build();
    }
}
