package ar.edu.unq.po2.tpTDD.poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerTestCase {
	
	private PokerStatus unPokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	

	@BeforeEach
	void setUp() throws Exception {
		unPokerStatus = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		
	}

	@Test
	void testVerificacionHayPokerCuandoHayCuatroCartasConMismoValor() {
		when(carta1.getValor()).thenReturn("4");
		when(carta2.getValor()).thenReturn("4");
		when(carta3.getValor()).thenReturn("4");
		when(carta4.getValor()).thenReturn("4");
		when(carta5.getValor()).thenReturn("1");
		assertEquals(unPokerStatus.verificar(carta1,carta2,carta3,carta4,carta5),"Poquer");
	}

	@Test 
	void testVerificacionHayColorCuandoLasCincoCartasTienenMismoPalo() {
		when(carta1.getValor()).thenReturn("4");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta2.getValor()).thenReturn("2");
		when(carta2.getPalo()).thenReturn("Pica");
		when(carta3.getValor()).thenReturn("3");
		when(carta3.getPalo()).thenReturn("Pica");
		when(carta4.getValor()).thenReturn("5");
		when(carta4.getPalo()).thenReturn("Pica");
		when(carta5.getValor()).thenReturn("1");
		when(carta5.getPalo()).thenReturn("Pica");
		assertEquals(unPokerStatus.verificar(carta1, carta2, carta3, carta4, carta5),"Color");
	}
	
	@Test
	void testVerificacionHayTrioCuandoTresCartasConMismoValor() {
		when(carta1.getValor()).thenReturn("2");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta2.getValor()).thenReturn("2");
		when(carta1.getPalo()).thenReturn("Diamante");
		when(carta3.getValor()).thenReturn("2");
		when(carta1.getPalo()).thenReturn("Trebol");
		when(carta4.getValor()).thenReturn("5");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta5.getValor()).thenReturn("1");
		when(carta1.getPalo()).thenReturn("Pica");
		assertEquals(unPokerStatus.verificar(carta1,carta2,carta3,carta4,carta5),"Trio");
	}
	
	@Test 
	void testVerificacionCuandoNoHayJuegoDaNada(){
		when(carta1.getValor()).thenReturn("4");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta2.getValor()).thenReturn("2");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta3.getValor()).thenReturn("3");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta4.getValor()).thenReturn("5");
		when(carta1.getPalo()).thenReturn("Pica");
		when(carta5.getValor()).thenReturn("1");
		when(carta1.getPalo()).thenReturn("Diamante");
		assertEquals(unPokerStatus.verificar(carta1,carta2,carta3,carta4,carta5),"Nada");
	}
}
