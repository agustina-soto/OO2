package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TijeraTest {
	private Tijera tijera;
	
	@BeforeEach
	void setUp() throws Exception {
		tijera = new Tijera();
	}
	
	@Test
	public void testDesafiar() {
		assertEquals("Empate", tijera.jugarContraTijera());
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Piedra", tijera.jugarContraPiedra());
	}
	
	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Tijera", tijera.jugarContraPapel());
	}
	
	@Test
	public void testJugarContraTijera() {
		assertEquals("Empate", tijera.jugarContraTijera());
	}

}
