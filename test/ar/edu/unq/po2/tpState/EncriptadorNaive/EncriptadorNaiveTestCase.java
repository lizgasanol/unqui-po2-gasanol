package ar.edu.unq.po2.tpState.EncriptadorNaive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptadorNaiveTestCase {

	EncriptadorNaive unEncriptadorNaive;
	EncriptadorVocales unEncriptadorVocales;
	EncriptadorNumeros unEncriptadorNumeros;
	
	@BeforeEach
	void setUp() throws Exception {
		unEncriptadorNaive = new EncriptadorNaive();
		unEncriptadorVocales = new EncriptadorVocales();
		unEncriptadorNumeros = new EncriptadorNumeros();
	}

	@Test
	void testUnEncriptadorNaivePuedeEncriptarUnString() {
		assertEquals(unEncriptadorNaive.encriptar("hola como estas"), "estas como hola");
	}

	@Test
	void testUnEncriptadorNaivePuedeDesencriptarUnString() {
		assertEquals(unEncriptadorNaive.desencriptar("estas como hola"), "hola como estas");
	}
	
	@Test
	void testUnEncriptadorVocalesPuedeEncriptarUnString() {
		assertEquals(unEncriptadorVocales.encriptar("Hola como estas"), "Hule cumu istes");
	}
	
	@Test
	void testUnEncriptadorVocalesPuedeDesencriptarUnString() {
		assertEquals(unEncriptadorVocales.desencriptar("Hule cumu istes"), "Hola como estas");
	}
	
	@Test
	void testUnEncriptadorNumerosPuedeEncriptarUnString() {
		assertEquals(unEncriptadorNumeros.encriptar("hola"),"8,16,12,1");
	}
	
	@Test
	void testUnEncriptadorNumerosPuedeDesencriptarUnString() {
		assertEquals(unEncriptadorNumeros.desencriptar("8,16,12,1"),"hola");
	}
}
