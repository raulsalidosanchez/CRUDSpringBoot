package com.crud.servicio.dto;

import java.util.Date;

import com.crud.modelo.entidad.Persona;

public class PersonaDto {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer telefono;
	private String email;
	private Date fnac;
	
	public PersonaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonaDto(String nombre, String apellidos, Integer telefono, String email, Date fnac) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.email = email;
		this.fnac = fnac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFnac() {
		return fnac;
	}

	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

	
	//metodo para pasar de DTO a pelicula (de DTO a entidad)
		public Persona asPersona(){
			return new Persona(nombre, apellidos, telefono, email, fnac);
		}
	
	
}
