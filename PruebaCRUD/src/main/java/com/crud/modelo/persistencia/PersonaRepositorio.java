package com.crud.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.modelo.entidad.Persona;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer>{
	
	//Los metodos basicos del crud ya estan implementados, en este repositorio vamos a incluir
	//mas métodos que necesitemos siguiendo la nomenclatura de finBy()
	
	
}
