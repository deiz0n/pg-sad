package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Relatorio;
import com.example.demo.repository.RelatorioRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RelatorioService {

	@Autowired
	private RelatorioRepository relatorioRepository;
	
	public List<Relatorio> getAllRelatorios() {
		return relatorioRepository.findAll();
	}
	
	public Relatorio getRelatorio(Long id) {
		var relatorio = relatorioRepository.findById(id);
		return relatorio.get();
	}

	public Relatorio addRelatorio(@RequestBody Relatorio relatorio) {
		return relatorioRepository.save(relatorio);
	}

	public void delRelatorio(@PathVariable Long id) {
		relatorioRepository.deleteById(id);
	}
	
}
