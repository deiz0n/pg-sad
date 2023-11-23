package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity(name = "tb_agendamento")
public class Agendamento {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instant data;

    @OneToOne
    private Usuario usuario;

    @OneToOne
    private Coleta coleta;

}
