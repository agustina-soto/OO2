package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class LagartoTest {
	private Lagarto lagarto;

	@BeforeEach
	void setUp() throws Exception {
		lagarto = new Lagarto();
	}

	@Test
	public void testDesafiar() {
		assertEquals("Gana Lagarto", lagarto.jugarContraSpock());
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Piedra", lagarto.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Lagarto", lagarto.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Tijera", lagarto.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Empate", lagarto.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Lagarto", lagarto.jugarContraSpock());
	}
}
