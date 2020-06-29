package ar.edu.unq.po2.tp6.bancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ClienteTestCase {

	private Cliente unCliente;
	private Banco unBanco;
	private SolicitudDeCreditoPersonal unaSolicitudDeCreditoPersonal;
	private SolicitudDeCreditoHipotecario unaSolicitudDeCreditoHipotecario;
	
	@BeforeEach
	void setUp() throws Exception {
		unBanco = mock(Banco.class);
		unaSolicitudDeCreditoPersonal = mock(SolicitudDeCreditoPersonal.class);
		unaSolicitudDeCreditoHipotecario = mock(SolicitudDeCreditoHipotecario.class);
		unCliente = new Cliente("Jorge", "Perez", "Mitre 666", 75, 10000d, unBanco);
	}

	@Test
	void testUnClientePuedeCalcularSuSueldoAnual() {
		assertEquals(unCliente.calcularSueldoNetoAnual(), 120000d);
	}

	@Test
	void testCuandoUnClienteSolicitaUnCreditoElBancoLoRecibe() {
		
		unCliente.solicitarCredito(unaSolicitudDeCreditoHipotecario);
		unCliente.solicitarCredito(unaSolicitudDeCreditoPersonal);
		
		verify(unBanco).registrarSolicitudDeCredito(unaSolicitudDeCreditoHipotecario);
		verify(unBanco).registrarSolicitudDeCredito(unaSolicitudDeCreditoPersonal);
	}
}
