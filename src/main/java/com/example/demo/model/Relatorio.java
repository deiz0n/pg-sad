package com.example.demo.model;

import com.example.demo.model.embeddables.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "tb_relatorio")
public class Relatorio {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Embedded
	private AcidezAtiva acidezAtiva;


	@Embedded
	private Situacao situacao;

	@Embedded
	@Column(name = "ctc_ph7")
	private CTCEpH7 ctcEpH7;

	@Embedded
	private Nutriente nutriente;

	@Embedded
	@Column(name = "texttura_materia_organica")
	private Textura textura;

	@Embedded
	private Saturacao saturacao;

	@Embedded
	@Column(name = "nutriente_mg")
	private NutrienteMg nutrienteMg;

	@JsonIgnore
	@OneToOne
	private Coleta coleta;

}
