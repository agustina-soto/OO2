package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class SpockTest {
	private Spock spock;

	@BeforeEach
	void setUp() throws Exception {
		spock = new Spock();
	}

	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Spock", spock.jugarContraPiedra());
	}

	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Papel", spock.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Spock", spock.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Lagarto", spock.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Empate", spock.jugarContraSpock());
	}

}
