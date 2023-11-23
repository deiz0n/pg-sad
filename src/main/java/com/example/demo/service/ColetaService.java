package com.example.demo.service;

import com.example.demo.model.Coleta;
import com.example.demo.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColetaService {

    @Autowired
    private ColetaRepository repository;

    public List<Coleta> getAllColetas() {
        var coletas = repository.findAll();
        return coletas;
    }

    public Coleta getColeta(Long id) {
        var coleta = repository.findById(id);
        return coleta.get();
    }

    public Coleta addColeta(Coleta coleta) {
        return repository.save(coleta);
    }

    public void delColeta(Long id) {
        repository.deleteById(id);
    }
}
