package com.example.demo.service;

import com.example.demo.model.Agendamento;
import com.example.demo.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> getAllAgendamentos() {
        var agendamentos = agendamentoRepository.findAll();
        return agendamentos;
    }

    public Agendamento getAgendamentoByID(Long id) {
        var agendamento = agendamentoRepository.findById(id);
        return agendamento.get();
    }

    public Agendamento addAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public void delAgendamento(Long id) {
        agendamentoRepository.deleteById(id);
    }

}
