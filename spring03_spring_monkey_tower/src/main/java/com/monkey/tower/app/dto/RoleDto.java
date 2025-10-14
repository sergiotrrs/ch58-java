package com.monkey.tower.app.dto;

public class RoleDto {
	
	private Long identificador;
	private String nombre;
	private String descripcion;
	
	public RoleDto(Long identificador, String nombre, String descripcion) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoleDto [identificador=");
		builder.append(identificador);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}
	

}
