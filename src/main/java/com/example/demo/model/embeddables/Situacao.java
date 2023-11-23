package com.example.demo.model.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Embeddable
public class Situacao {

    private BigDecimal sequeiro;

}
