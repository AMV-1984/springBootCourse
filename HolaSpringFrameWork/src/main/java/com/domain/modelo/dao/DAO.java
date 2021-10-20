package com.domain.modelo.dao;

import java.util.List;

import com.domain.modelo.Model;

public interface DAO {
	
	abstract void agregar(Model m);
	
	abstract void modificar(Model m);
	
	abstract void eliminar(Model m);
	
	abstract List<Model> leer(Model m);

}
