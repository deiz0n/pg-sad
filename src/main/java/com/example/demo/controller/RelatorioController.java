package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Relatorio;
import com.example.demo.repository.RelatorioRepository;
import com.example.demo.service.RelatorioService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

	@Autowired
	private RelatorioService service;
	
	@GetMapping
	public ResponseEntity<List<Relatorio>> getRelatorios() {
		var relatorios = service.getAllRelatorios();
		return ResponseEntity.ok().body(relatorios);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Relatorio> getRelatorio(@PathVariable Long id) {
		var relatorio = service.getRelatorio(id);
		return ResponseEntity.ok().body(relatorio);
	}

	@PostMapping
	public ResponseEntity<?> createRelatorio(@RequestBody Relatorio relatorio) {
		var obj = service.addRelatorio(relatorio);
		return ResponseEntity.status(HttpStatus.CREATED).body(obj);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteRelatorio(@PathVariable Long id) {
		service.delRelatorio(id);
		return ResponseEntity.noContent().build();
	}


	
}
