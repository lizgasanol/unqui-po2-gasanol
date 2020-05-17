package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	EquipoDeTrabajo unEquipoDeTrabajo;
	Persona juanpi;
	Persona mara;
	Persona jorge;
	Persona nacho;
	Persona carlitos;
	
	@BeforeEach
	void setUp() throws Exception {
		unEquipoDeTrabajo = new EquipoDeTrabajo("Badass Crew");
		juanpi = new Persona("Juan Pablo","Alonso",LocalDate.of(1998, 1, 1));
		mara = new Persona("Mara","Balbuena",LocalDate.of(1998, 3, 4));
		jorge = new Persona("Jorge","Soprano",LocalDate.of(1998, 4, 6));
		nacho = new Persona("Ignacio","Rizzo",LocalDate.of(1998, 3, 1));
		carlitos = new Persona("Carlos","Privyet",LocalDate.of(1998, 2, 15));
	}

	@Test
	void testListaDeIntegrantesInicializaVacia() {
		assertTrue(unEquipoDeTrabajo.getIntegrantes().isEmpty());
	}
	
	@Test
	void testPuedoAgregarPersonasALaListaDeIntegrantes() {
		unEquipoDeTrabajo.agregarIntegrante(juanpi);
		assertEquals(unEquipoDeTrabajo.getIntegrantes().size(),1);
		assertTrue(unEquipoDeTrabajo.getIntegrantes().contains(juanpi));
	}

	@Test
	void testPuedoCalcularElPromedioDeEdades() {
		unEquipoDeTrabajo.agregarIntegrante(juanpi);
		unEquipoDeTrabajo.agregarIntegrante(mara);
		unEquipoDeTrabajo.agregarIntegrante(jorge);
		unEquipoDeTrabajo.agregarIntegrante(nacho);
		unEquipoDeTrabajo.agregarIntegrante(carlitos);
		
		assertEquals(unEquipoDeTrabajo.edadPromedio(),22);
	}
}
