package ar.edu.unq.po2.tpTemplateAdapter.sueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTestCase {

	private Empleado unEmpleadoTemporario;
	private Empleado unEmpleadoPasante;
	private Empleado unEmpleadoPlanta;
	
	@BeforeEach
	void setUp() throws Exception {
		unEmpleadoTemporario = new EmpleadoTemporario(false, 1);
		unEmpleadoPasante = new EmpleadoPasante(true, 2);
		unEmpleadoPlanta = new EmpleadoPlanta(true, 3);
		
		unEmpleadoPasante.setCantidadDeHoras(30);
		unEmpleadoTemporario.setCantidadDeHoras(100);
		unEmpleadoPlanta.setCantidadDeHoras(200);
	}

	@Test
	void testUnEmpleadoPuedeResponderSuSueldoSinDescuentos() {
		assertEquals(unEmpleadoTemporario.sueldo(), 1392d);
		assertEquals(unEmpleadoPasante.sueldo(), 1044d);
		assertEquals(unEmpleadoPlanta.sueldo(), 3001.5d);
	}

}
