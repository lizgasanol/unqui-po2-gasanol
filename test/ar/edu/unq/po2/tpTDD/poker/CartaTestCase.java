package ar.edu.unq.po2.tpTDD.poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTestCase {

	private Carta unaCarta;
	private Carta otraCarta;
	
	@BeforeEach
	void setUp() throws Exception {
		unaCarta = new Carta("10", "Pica");
		otraCarta = new Carta ("K", "Pica");
	}

	@Test
	void testConstructor() {
		assertEquals(unaCarta.getValor(), "10");
		assertEquals(unaCarta.getPalo(),"Pica");
	}

	@Test
	void testUnaCartaEsMayorQueOtra() {
		assertTrue(otraCarta.valeMasQue(unaCarta));
	}
	
	@Test
	void testUnaCartaNoEsMayorQueOtra(){
		assertFalse(unaCarta.valeMasQue(unaCarta));
	}
}
