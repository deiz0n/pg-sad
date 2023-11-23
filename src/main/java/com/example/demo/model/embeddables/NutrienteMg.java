package com.example.demo.model.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Embeddable
public class NutrienteMg {

    private BigDecimal fe3;
    private BigDecimal s1;
    private BigDecimal mn3;
    private BigDecimal zn3;
    private BigDecimal cu3;
    private BigDecimal b2;

}
