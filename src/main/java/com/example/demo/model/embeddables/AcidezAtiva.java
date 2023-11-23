package com.example.demo.model.embeddables;

import java.math.BigDecimal;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Data
@Embeddable
public class AcidezAtiva {

	private BigDecimal pHCalCl3;
	private BigDecimal pHH20;
	
}
