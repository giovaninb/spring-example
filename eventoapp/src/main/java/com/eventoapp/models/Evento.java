package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Entity
public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	
	@NotEmpty @NotNull
	private String nome;
	@NotEmpty @NotNull
	private String local;
	@NotEmpty @NotNull
	private String data;
	@NotEmpty @NotNull
	private String horario;

	@OneToMany
	private List<Convidado> convidados;
}
