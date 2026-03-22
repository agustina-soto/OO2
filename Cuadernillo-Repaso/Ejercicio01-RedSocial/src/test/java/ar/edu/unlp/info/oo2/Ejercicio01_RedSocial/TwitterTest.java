package ar.edu.unlp.info.oo2.Ejercicio01_RedSocial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TwitterTest {
	private Twitter twitter;
	private Usuario usuario;
	
	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
		usuario = twitter.agregarUsuario("hannah-montana");
	}
	
	@Test
	public void testAgregarUsuario() {
		assertNull(twitter.agregarUsuario("hannah-montana")); // Nombre de usuario ya registrado
		assertNotNull(twitter.agregarUsuario("taylorswift")); // Nombre de usuario aceptado
	}
	
	
	@Test
	public void testEliminarUsuario() {
		twitter.eliminarUsuario(usuario);
		assertFalse(twitter.existeUsuario(usuario.getScreenName()));
	}
	
}