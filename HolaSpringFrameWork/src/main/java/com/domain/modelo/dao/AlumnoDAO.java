package com.domain.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.Alumno;
import com.domain.modelo.Model;
import com.domain.util.ConnectionManager;

public class AlumnoDAO implements DAO {

	private Connection conexion;

	public AlumnoDAO() {
	}

	public void agregar(Model m) throws ClassNotFoundException, SQLException {
		ConnectionManager.connect();
		conexion = ConnectionManager.getConnexion();

		StringBuilder sql = new StringBuilder(
				"INSERT INTO alumnos (ALU_APELLIDO,ALU_NOMBRE,ALU_EMAIL,ALU_CONOCIMIENTOS,ALU_GIT,ALU_OBSERVACIONES) ");
		sql.append("VALUES (?,?,?,?,?,?)");

		Alumno alum = (Alumno) m;

		PreparedStatement ps = conexion.prepareStatement(sql.toString());
		ps.setString(1, alum.getApellido());
		ps.setString(2, alum.getNombre());
		ps.setString(3, alum.getEmail());
		ps.setString(4, alum.getEstudios());
		ps.setString(5, alum.getLinkArepositorio());
		ps.setString(6, alum.getObservaciones());
		ps.executeUpdate();

		conexion.close();

		ConnectionManager.disconnect();

	}

	public void modificar(Model m) throws ClassNotFoundException, SQLException {
		ConnectionManager.connect();
		conexion = ConnectionManager.getConnexion();
		
		StringBuilder sql = new StringBuilder("UPDATE alumnos set ");
		sql.append("ALU_APELLIDO=?,ALU_NOMBRE=?,ALU_EMAIL=?,ALU_CONOCIMIENTOS=?,ALU_GIT=?,ALU_OBSERVACIONES=?");
		sql.append("WHERE ALU_ID = ?");
		
		Alumno alum = (Alumno) m;

		PreparedStatement ps = conexion.prepareStatement(sql.toString());
		ps.setString(1, alum.getApellido());
		ps.setString(2, alum.getNombre());
		ps.setString(3, alum.getEmail());
		ps.setString(4, alum.getEstudios());
		ps.setString(5, alum.getLinkArepositorio());
		ps.setString(6, alum.getObservaciones());
		ps.setInt(7, alum.getCodigo());
		ps.executeUpdate();

		conexion.close();

		ConnectionManager.disconnect();

	}

	public void eliminar(Model m) throws ClassNotFoundException, SQLException {
		ConnectionManager.connect();
		conexion = ConnectionManager.getConnexion();
		
		StringBuilder sql = new StringBuilder("DELETE FROM alumnos ");
		sql.append("WHERE ALU_ID = ?");
		
		Alumno alum = (Alumno) m;

		PreparedStatement ps = conexion.prepareStatement(sql.toString());
		ps.setInt(1, alum.getCodigo());
		ps.executeUpdate();

		conexion.close();

		ConnectionManager.disconnect();

	}

	public List<Model> leer(Model m) throws ClassNotFoundException, SQLException {
		ConnectionManager.connect();
		conexion = ConnectionManager.getConnexion();

		conexion.close();

		ConnectionManager.disconnect();
		return null;
	}

}
