package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PapelTest {
	private Papel papel;
	
	@BeforeEach
	void setUp() throws Exception {
		papel = new Papel();
	}
	
	@Test
	public void testDesafiar() {
		assertEquals("Gana Tijera", papel.jugarContraTijera());
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Papel", papel.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Empate", papel.jugarContraPapel());
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Tijera", papel.jugarContraTijera());
	}
}
