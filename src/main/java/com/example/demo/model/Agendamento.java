package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity(name = "tb_agendamento")
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime data;

    @JsonIgnore
    @ManyToOne
    private Usuario usuario;

    @OneToOne
    private Coleta coleta;

}
