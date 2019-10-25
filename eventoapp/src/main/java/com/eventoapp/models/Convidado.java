package com.eventoapp.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Convidado {
	
	@Id @NotEmpty @NotNull
	private String rg;
	@NotEmpty @NotNull
	private String nomeConvidado;

	@ManyToOne
	private Evento evento;
}
