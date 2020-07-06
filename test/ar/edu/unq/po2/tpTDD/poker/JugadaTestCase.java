package ar.edu.unq.po2.tpTDD.poker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadaTestCase {
	
	private JugadaPoker jugadaPoker;
	private JugadaColor jugadaColor;
	private JugadaTrio jugadaTrio;
	private JugadaVacia jugadaVacia;

	@BeforeEach
	void setUp() throws Exception {
		jugadaPoker = new JugadaPoker();
		jugadaColor = new JugadaColor();
		jugadaTrio = new JugadaTrio();
		jugadaVacia = new JugadaVacia();
	}
	
	@Test
	void test() {
		
	}
	
}
