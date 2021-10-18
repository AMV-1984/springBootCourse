package es.com.inetum.elementos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.inetum.elementos.modelo.ElementoFactory;
import es.com.inetum.elementos.modelo.Papel;
import es.com.inetum.elementos.modelo.Piedra;
import es.com.inetum.elementos.modelo.Tijera;

public class ElementoFactoryTest {
	
	Piedra piedra;
	Papel  papel;
	Tijera tijera;

	
	@Before
	public void setUp() throws Exception {
		//Antes de cada test
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}

	@After
	public void tearDown() throws Exception {
		//Despues de cada test
		piedra = null;
		papel  = null;
		tijera = null;
	}

	@Test
	public void testCompararPiedraConTijera() {
		assertEquals(1, piedra.comparar(tijera));
		assertEquals("Piedra gana a Tijera", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraConPapel() {
		assertEquals(-1, piedra.comparar(papel));
		assertEquals("Piedra pierde con Papel", piedra.getDescripcionResultado());
	}
	
	@Test
	public void testCompararPiedraConPiedra() {
		assertEquals(0, piedra.comparar(piedra));
		assertEquals("Empate", piedra.getDescripcionResultado());
	}

	@Test
	public void testGetInstancePiera() {
		assertTrue(ElementoFactory.getInstance(0) instanceof Piedra);
	}

	@Test
	public void testGetInstancePapel() {
		assertTrue(ElementoFactory.getInstance(1) instanceof Papel);
	}

	@Test
	public void testGetInstanceTijera() {
		assertTrue(ElementoFactory.getInstance(2) instanceof Tijera);
	}


}
