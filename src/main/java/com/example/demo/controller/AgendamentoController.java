package com.example.demo.controller;


import com.example.demo.model.Agendamento;
import com.example.demo.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public ResponseEntity<List<Agendamento>> getAgendamentos() {
        var agendamentos = service.getAllAgendamentos();
        return ResponseEntity.ok().body(agendamentos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> getAgendamento(@PathVariable Long id) {
        var agendamento = service.getAgendamentoByID(id);
        return ResponseEntity.ok().body(agendamento);
    }

    @PostMapping
    public ResponseEntity<?> createAgendamento(@RequestBody Agendamento agendamento) {
        var obj = service.addAgendamento(agendamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgendamento(@PathVariable Long id) {
        service.delAgendamento(id);
        return ResponseEntity.noContent().build();
    }
}
