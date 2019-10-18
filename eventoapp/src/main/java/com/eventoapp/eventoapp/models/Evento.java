package com.eventoapp.eventoapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Evento {
	
	private String nome;
	private String local;
	private String data;
	private String horário;

}
