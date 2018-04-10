package com.crud.modelo.negocio;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.modelo.entidad.Persona;
import com.crud.modelo.persistencia.PersonaRepositorio;

@Service
@Transactional //por defecto es required.
public class GestorPersonas {
	
	@Autowired
	private PersonaRepositorio personaRepositorio;
	
	
	public void insertar(Persona persona) {
		personaRepositorio.save(persona); //Aqui en la URL no le pasamos un id, por lo que hace un insert
	}
	
	public void modificar(Persona persona) {
		personaRepositorio.save(persona); //Aqui en la URL si que le pasamos un id, por lo que sabe que lo que tiene que hacer es modificar
	}
	
	public void borrar(Persona persona) {
		personaRepositorio.delete(persona);
	}
	
	public List<Persona> listar(){
		return personaRepositorio.findAll();
	}
	
}
