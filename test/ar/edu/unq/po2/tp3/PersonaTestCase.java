package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	public Persona unaPersona;
	public Persona otraPersona;
	
	@BeforeEach
	void setUp() throws Exception {
		unaPersona = new Persona("Juan Carlos","Guerrero",LocalDate.of(1998, 5, 6));
		otraPersona = new Persona("Julian","Rodriguez",LocalDate.of(1997, 1, 1));

	}

	@Test
	void testEdad() {
		assertEquals(unaPersona.getEdad(),22);
		assertEquals(otraPersona.getEdad(),23);
	}

	@Test
	void testMenorQue() {
		assertTrue(unaPersona.menorQue(otraPersona));
		assertFalse(otraPersona.menorQue(unaPersona));
	}
}
