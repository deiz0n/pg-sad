package com.example.demo.model.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Embeddable
public class Textura {

    private BigDecimal arenosa;
    private BigDecimal media;
    private BigDecimal argilosa;
    private BigDecimal muitaArgilosa;

}
