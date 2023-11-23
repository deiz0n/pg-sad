package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_coleta")
public class Coleta {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String localizacao;
    private LocalDate data;

    @OneToOne
    private Agendamento agendamento;

    @OneToOne
    private Relatorio relatorio;

}
