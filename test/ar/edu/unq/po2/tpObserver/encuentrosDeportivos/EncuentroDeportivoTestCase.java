package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncuentroDeportivoTestCase {

	private EncuentroDeportivo unEncuentroDeportivo;
	
	@BeforeEach
	void setUp() throws Exception {
		List<String> unaListaDeContrincantes = Arrays.asList("","","","");
		unEncuentroDeportivo = new EncuentroDeportivo("0 a 3", unaListaDeContrincantes);
	}

	@Test
	void testConstructorDeEncuentroDeportivo() {
		
	}

}
