package com.proyecto.aerolinea.entity;

import lombok.Data;

@Data
public class Pasaje {

	private Integer codigo;

	private String clase;

	private String asiento;

	private int valor;

	public Cliente cliente;

	public Vuelo vuelo;

}
