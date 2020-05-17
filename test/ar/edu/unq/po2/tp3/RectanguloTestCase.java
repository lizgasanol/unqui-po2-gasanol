package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	private Rectangulo rectangulo;
	@BeforeEach
	void setUp() throws Exception {
		rectangulo = new Rectangulo(new Point(2,3), 5, 6);
	}

	@Test
	void testArea() {
		assertEquals(rectangulo.area(),30);
	}
	
	@Test
	void testPerimetro() {
		assertEquals(rectangulo.perimetro(),22);
	}

	@Test
	void testEsHorizontal() {
		assertFalse(rectangulo.esHorizontal());
	}
}
