package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Relatorio;
import com.example.demo.repository.RelatorioRepository;

@Service
public class RelatorioService {

	@Autowired
	private RelatorioRepository relatorioRepository;
	
	public List<Relatorio> getAllRelatorios() {
		return relatorioRepository.findAll();
	}
	
	
	
}
