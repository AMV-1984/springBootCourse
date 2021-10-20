package com.domain.modelo;

public class Alumno {

	private int codigo;
	private String nombre;
	private String apellido;
	private String estudios;
	private String linkArepositorio;
	
	public Alumno() {}
	
	public Alumno(int pnum, String pStr1, String pStr2, String pStr3, String pStr4) {}
	
	public Alumno(int pnum) {}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public String getLinkArepositorio() {
		return linkArepositorio;
	}
	public void setLinkArepositorio(String linkArepositorio) {
		this.linkArepositorio = linkArepositorio;
	}
	
	public int hashCode(Object ob) {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ob == null) ? 0 : ob.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	
	
}
