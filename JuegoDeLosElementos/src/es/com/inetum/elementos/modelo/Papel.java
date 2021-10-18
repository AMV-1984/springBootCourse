package es.com.inetum.elementos.modelo;

public class Papel extends ElementoFactory {

	public Papel() {
		super("papel", 1);
		
	}


	@Override
	public int comparar(ElementoFactory element) {
		int numero = element.getNumero();
		
		int resultado = 0;
		switch (numero) {
			case TIJERA: {
				
				resultado = -1;
				descripcionResultado = "Papel pierde con Tijera";
				break;
			}
			case PIEDRA:{
				resultado = -1;
				descripcionResultado = "Papel gana a Piedra";
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
