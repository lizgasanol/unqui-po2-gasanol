package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador;
	@BeforeEach
	void setUp() throws Exception {
		multioperador = new Multioperador();
		this.multioperador.anadirNumero(3);
		this.multioperador.anadirNumero(1);
		this.multioperador.anadirNumero(2);

	}

	@Test
	void testSuma() {
		assertEquals(this.multioperador.sumarLista(),6);
	}

	@Test
	void testResta() {
		assertEquals(this.multioperador.restarLista(), 0);
	}
	
	@Test
	void testMult() {
		assertEquals(multioperador.multiplicarLista(),6);
		
	}
}
