package ar.edu.unq.po2.tp6.bancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


class SolicitudDeCreditoTestCase {

	private SolicitudDeCreditoPersonal unaSolicitudDeCreditoPersonal;
	private SolicitudDeCreditoHipotecario unaSolicitudDeCreditoHipotecario;
	private Cliente unClienteConIngresoMensual10000;
	private Cliente unClienteConIngresoMensual20000;
	
	@BeforeEach
	void setUp() throws Exception {
		unClienteConIngresoMensual10000 = mock(Cliente.class);
		unClienteConIngresoMensual20000 = mock(Cliente.class);
		unaSolicitudDeCreditoPersonal = new SolicitudDeCreditoPersonal(unClienteConIngresoMensual10000, 70000d, 10);
		unaSolicitudDeCreditoHipotecario = new SolicitudDeCreditoHipotecario(unClienteConIngresoMensual20000, 70000d, 14, "casa", "paunero 8282", 100000d);
	}

	@Test
	void testUnaSolicitudDeCreditoPuedeCalcularSuCuotaMensual() {
		assertEquals(unaSolicitudDeCreditoPersonal.cuotaMensual(), 7000d);
		assertEquals(unaSolicitudDeCreditoHipotecario.cuotaMensual(), 5000d);
	}

	@Test
	void testUnaSolicitudDeCreditoPersonalEsAceptableParaClienteConIngresoMensual10000() {
		when(unClienteConIngresoMensual10000.calcularSueldoNetoAnual()).thenReturn(120000d);
		when(unClienteConIngresoMensual10000.getSueldoNetoMensual()).thenReturn(10000d);
		
		assertTrue(unaSolicitudDeCreditoPersonal.esAceptable());
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalNoEsAceptableParaClienteCuandoCuotaSupera70DeSueldoMensual() {
		when(unClienteConIngresoMensual10000.calcularSueldoNetoAnual()).thenReturn(120000d);
		when(unClienteConIngresoMensual10000.getSueldoNetoMensual()).thenReturn(10000d);
		SolicitudDeCreditoPersonal otraSolicitudDeCreditoPersonal = new SolicitudDeCreditoPersonal(unClienteConIngresoMensual10000, 80000d, 10);
		
		assertFalse(otraSolicitudDeCreditoPersonal.esAceptable());
	}
	
	@Test
	void testUnaSolicitudDeCreditoPersonalNoEsAceptableParaClienteCuandoSuIngresoAnualEsMenorA15000() {
		when(unClienteConIngresoMensual10000.calcularSueldoNetoAnual()).thenReturn(12000d);
		SolicitudDeCreditoPersonal otraSolicitudDeCreditoPersonal = new SolicitudDeCreditoPersonal(unClienteConIngresoMensual10000, 100d, 10);
		
		assertFalse(otraSolicitudDeCreditoPersonal.esAceptable());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioEsAceptable() {
		when(unClienteConIngresoMensual20000.getSueldoNetoMensual()).thenReturn(20000d);
		when(unClienteConIngresoMensual20000.getEdad()).thenReturn(50);
		
		assertTrue(unaSolicitudDeCreditoHipotecario.esAceptable());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioNoEsAceptableCuandoLaCuotaSuperaEl50DelSueldoMensual() {
		when(unClienteConIngresoMensual20000.getSueldoNetoMensual()).thenReturn(9000d);
		
		assertFalse(unaSolicitudDeCreditoHipotecario.esAceptable());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioNoEsAceptableCuandoElMontoTotalSuperaEl70DelValorFiscal() {
		when(unClienteConIngresoMensual20000.getSueldoNetoMensual()).thenReturn(20000d);
		when(unClienteConIngresoMensual20000.getEdad()).thenReturn(50);
		SolicitudDeCreditoHipotecario otraSolicitudDeCreditoHipotecario = new SolicitudDeCreditoHipotecario(unClienteConIngresoMensual20000, 80000d, 14, "casa", "paunero 8282", 100000d);
		
		assertFalse(otraSolicitudDeCreditoHipotecario.esAceptable());
	}
	
	@Test
	void testUnaSolicitudDeCreditoHipotecarioNoEsAceptableCuandoLaEdadSupera65AlFinalDeLasCuotas() {
		when(unClienteConIngresoMensual20000.getSueldoNetoMensual()).thenReturn(20000d);
		when(unClienteConIngresoMensual20000.getEdad()).thenReturn(65);
		
		assertFalse(unaSolicitudDeCreditoHipotecario.esAceptable());
	}
}
