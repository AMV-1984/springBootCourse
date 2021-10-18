package es.com.inetum.elementos.modelo;

public class Tijera extends ElementoFactory {

	public Tijera() {
		super("tijera", 2);
		
	}


	@Override
	public int comparar(ElementoFactory element) {
		int numero = element.getNumero();
		
		int resultado;
		switch (numero) {
			case PAPEL: {
				
				resultado = 1;
				descripcionResultado = "Tijera gana a pierde";
				break;
			}
			case PIEDRA:{
				resultado = -1;
				descripcionResultado = "Tijera pierde con Piedra";
				break;
				
			}
			default :{
				resultado = 0;
				descripcionResultado = "Empate";
			}
			
		}
		return resultado;
	}

}
