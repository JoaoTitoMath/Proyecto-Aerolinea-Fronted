package com.proyecto.aerolinea.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Tinerario {

	private Integer codigo;

	private Date fecha;

	private String hora;

	public Origen origen;

	public Destino destino;

}
