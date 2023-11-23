package com.example.demo.model.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Embeddable
public class Nutriente {

    private BigDecimal ca;
    private BigDecimal mg;

}
