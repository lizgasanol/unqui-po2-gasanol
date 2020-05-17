package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	private Point puntoVacio; 
	private Point punto;
	@BeforeEach
	void setUp() throws Exception {
		puntoVacio = new Point();
		punto = new Point(1,2);
	}

	@Test
	void testConstructor() {
		assertEquals(puntoVacio.getX(),0);
		assertEquals(puntoVacio.getY(),0);
		assertEquals(punto.getX(),1);
		assertEquals(punto.getY(),2);
	}

	@Test
	void testMove() {
		puntoVacio.move(3,3);
		punto.move(2,1);
		
		assertEquals(puntoVacio.getX(),3);
		assertEquals(puntoVacio.getY(),3);
		assertEquals(punto.getX(),2);
		assertEquals(punto.getY(),1);
	}
	
	@Test
	void testAdd() {
		Point puntoNuevo = puntoVacio.addPoint(punto);
		assertEquals(puntoNuevo.getX(),1);
		assertEquals(puntoNuevo.getY(),2);
	}
}
