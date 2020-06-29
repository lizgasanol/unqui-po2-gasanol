package ar.edu.unq.po2.tp5.cajaMercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {

	private Caja unaCaja;
	private Producto unProductoDeEmpresaTradicional;
	private Producto unProductoDeEmpresaCooperativa;
	
	
	@BeforeEach
	void setUp() throws Exception {
		unaCaja = new Caja();
		unProductoDeEmpresaTradicional = new ProductoDeEmpresaTradicional(10d, 10);
		unProductoDeEmpresaCooperativa = new ProductoDeEmpresaCooperativa(10d, 5);
		unaCaja.registrarProducto(unProductoDeEmpresaTradicional);
		unaCaja.registrarProducto(unProductoDeEmpresaCooperativa);
	}

	@Test
	void testRegistrarProductoAgregaALaListaDeProductosRegistrados() {
		assertEquals(2, unaCaja.getProductos().size());
	}

	@Test
	void testRegistrarProductoAgregaElMontoDelMismoAlMontoTotal() {
		assertEquals(19d, unaCaja.getMontoTotal());
	}
}
