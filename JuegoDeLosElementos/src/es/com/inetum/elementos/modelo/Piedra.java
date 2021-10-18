package es.com.inetum.elementos.modelo;

public class Piedra extends ElementoFactory {

	public Piedra() {
		super("piedra", 0);
		
	}


	@Override
	public int comparar(ElementoFactory element) {
		int numero = element.getNumero();
		
		int resultado;
		switch (numero) {
			case TIJERA: {
				
				resultado = 1;
				descripcionResultado = "Piedra gana a Tijera";
				break;
			}
			case PAPEL:{
				resultado = -1;
				descripcionResultado = "Piedra pierde con Papel";
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
