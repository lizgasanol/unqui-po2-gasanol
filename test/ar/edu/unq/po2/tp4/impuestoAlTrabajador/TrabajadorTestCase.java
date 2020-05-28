package ar.edu.unq.po2.tp4.impuestoAlTrabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	
	private Trabajador unTrabajador;
	private Ingreso unIngreso;
	private IngresoPorHorasExtra unIngresoPorHorasExtra;

	@BeforeEach
	void setUp() throws Exception {
		unTrabajador = new Trabajador();
		unIngreso = new Ingreso("abril", "sueldo", 100d);
		unIngresoPorHorasExtra = new IngresoPorHorasExtra("abril", "premioPorHorasExtra", 50d, 5);
	}

	@Test
	void testAgregarIngresoAlTrabajador() {
		unTrabajador.agregrarIngreso(unIngreso);
		
		assertEquals(1, unTrabajador.getIngresosPercibidosDelAño().size());
	}

	@Test
	void testTrabajadorSabeSuMontoTotalPercibido() {
		unTrabajador.agregrarIngreso(unIngreso);
		unTrabajador.agregrarIngreso(unIngresoPorHorasExtra);
		
		assertEquals(150d, unTrabajador.getTotalPercibido());
	}
	
	@Test
	void testTrabajadorSabeSuMontoImponible() {
		unTrabajador.agregrarIngreso(unIngreso);
		unTrabajador.agregrarIngreso(unIngresoPorHorasExtra);
		
		assertEquals(100d, unTrabajador.getMontoImponible());
	}
	
	@Test
	void testTrabajadorSabeSuImpuestoAPagar() {
		unTrabajador.agregrarIngreso(unIngreso);
		unTrabajador.agregrarIngreso(unIngresoPorHorasExtra);
		
		assertEquals(20d, unTrabajador.getImpuestoAPagar());
	}
}
