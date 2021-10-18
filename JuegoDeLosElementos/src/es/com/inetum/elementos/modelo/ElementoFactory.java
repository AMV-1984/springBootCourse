package es.com.inetum.elementos.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoFactory {
	
	public static final int PIEDRA = 0;
	public static final int PAPEL = 1;
	public static final int TIJERA = 2;
	
	
	protected String descripcionResultado;
	private static List<ElementoFactory> elementos;
	private int numero;
	private String nombre;
	
	
	//Constructor
	public ElementoFactory(String pNombre, int pNumero) {
		numero = pNumero;
		nombre = pNombre;
	}
	
	//Getter / Setter
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionResultado() {
		return descripcionResultado;
	}
	
	//Metodos de negocio
	public boolean isMe(int pNum) {
		return numero == pNum;
	}
	
	public abstract int comparar(ElementoFactory elemento);
	
	public static ElementoFactory getInstance(int pNum) {
		elementos = new ArrayList<ElementoFactory>();
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		
		for(ElementoFactory elemento : elementos) {
			if(elemento.isMe(pNum)) {
				return elemento;
			}
		}
		return null;
		
	};
	
	
}
