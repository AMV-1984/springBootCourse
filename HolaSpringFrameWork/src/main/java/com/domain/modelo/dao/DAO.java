package com.domain.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.Model;

public interface DAO {
	
	public void agregar(Model m) throws ClassNotFoundException, SQLException;
	
	public void modificar(Model m) throws ClassNotFoundException, SQLException;
	
	public void eliminar(Model m) throws ClassNotFoundException, SQLException;
	
	public List<Model> leer(Model m) throws ClassNotFoundException, SQLException;

}
