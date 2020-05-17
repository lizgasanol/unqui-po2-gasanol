package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {

	private Cuadrado cuadrado;
	@BeforeEach
	void setUp() throws Exception {
		cuadrado = new Cuadrado(new Point(0,0),5);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
