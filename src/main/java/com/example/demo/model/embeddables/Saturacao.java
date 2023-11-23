package com.example.demo.model.embeddables;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.lang.invoke.VarHandle;
import java.math.BigDecimal;

@Data
@Embeddable
public class Saturacao {

    private BigDecimal porBase;
    private BigDecimal porAliminio;

}
