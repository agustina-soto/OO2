package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PiedraTest {
	private Piedra piedra;

	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
	}

	@Test
	public void testDesafiar() {
		assertEquals("Gana Papel", piedra.jugarContraPapel());
	}

	@Test
	public void testJugarContraPiedra() {
		assertEquals("Empate", piedra.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Papel", piedra.jugarContraPapel());
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Piedra", piedra.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Piedra", piedra.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Spock", piedra.jugarContraSpock());
	}
}
