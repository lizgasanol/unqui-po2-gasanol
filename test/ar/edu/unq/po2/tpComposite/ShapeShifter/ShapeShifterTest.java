package ar.edu.unq.po2.tpComposite.ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testUnaHojaCompuestaConOtraHojaMeDaCompuestoDeLasDosHojas() {
		ShapeShifterLeaf unaHoja = new ShapeShifterLeaf(1);
		ShapeShifterLeaf otraHoja = new ShapeShifterLeaf(2);
		
		assertEquals(unaHoja.compose(otraHoja).getShapeShifters().size(), 2);
		assertTrue(unaHoja.compose(otraHoja).getShapeShifters().contains(unaHoja));
		assertTrue(unaHoja.compose(otraHoja).getShapeShifters().contains(otraHoja));
	}

	@Test
	void testUnCompuestoCompuestoConUnaHojaMeDaCompuestoDeAmbos() {
		IShapeShifter unaHoja = new ShapeShifterLeaf(1);
		IShapeShifter otraHoja = new ShapeShifterLeaf(2);
		IShapeShifter unCompuesto = unaHoja.compose(otraHoja);
		
		assertEquals(unCompuesto.compose(unaHoja).getShapeShifters().size(), 2);
		assertTrue(unCompuesto.compose(unaHoja).getShapeShifters().contains(unCompuesto));
		assertTrue(unCompuesto.compose(unaHoja).getShapeShifters().contains(unaHoja));
	}
	
	@Test
	void testUnCompuestoSabeSuProfundidad() {
		IShapeShifter unaHoja = new ShapeShifterLeaf(1);
		IShapeShifter otraHoja = new ShapeShifterLeaf(2);
		IShapeShifter unCompuesto = unaHoja.compose(otraHoja);
		
		assertEquals(unaHoja.deepest(), 0);
		assertEquals(unCompuesto.deepest(), 1);
		assertEquals(unCompuesto.compose(unCompuesto).deepest(), 2);
	}
	
	@Test
	void testUnCompuestoSabeAplanar() {
		IShapeShifter unaHoja = new ShapeShifterLeaf(1);
		IShapeShifter otraHoja = new ShapeShifterLeaf(2);
		IShapeShifter tercerHoja = new ShapeShifterLeaf(3);
		IShapeShifter unCompuesto = unaHoja.compose(otraHoja);
		IShapeShifter otroCompuesto = unCompuesto.compose(tercerHoja);
		
		assertEquals(otroCompuesto.flat().getShapeShifters().size(), 3);
		assertFalse(otroCompuesto.flat().getShapeShifters().contains(unCompuesto));
	}
	
	@Test
	void testUnCompuestoSabeDevolverSusValores() {
		IShapeShifter unaHoja = new ShapeShifterLeaf(1);
		IShapeShifter otraHoja = new ShapeShifterLeaf(2);
		IShapeShifter tercerHoja = new ShapeShifterLeaf(3);
		IShapeShifter unCompuesto = unaHoja.compose(otraHoja);
		IShapeShifter otroCompuesto = unCompuesto.compose(tercerHoja);
		
		assertEquals(otroCompuesto.values().size(), 3);
		assertTrue(otroCompuesto.values().contains(1));
		assertTrue(otroCompuesto.values().contains(2));
		assertTrue(otroCompuesto.values().contains(3));
	}
}
