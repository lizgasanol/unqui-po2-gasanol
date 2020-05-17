package ar.edu.unq.po2.restaurant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlatoTradicionalTest {
	private PlatoTradicional tomateConHuevo;
	private PlatoTradicional zanahoriaHuevoRuculaParmesano;
	
	@BeforeEach
	public void setUp( ) {
		tomateConHuevo = new PlatoTradicional("huevo con tomate",2,100f);
		zanahoriaHuevoRuculaParmesano = new PlatoTradicional("zanahoria,rucula,parmesano",4,100f);
	}
	
	@Test
	public void testPlatoTradicionalMenos3Ingredientes() {
		assertEquals(120f,tomateConHuevo.getPrecio());
	}
}
