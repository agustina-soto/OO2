package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public class Piedra implements OpcionDeJuego {

	// Cuando desafio yo:
	public String desafiar(OpcionDeJuego contrincante) {
		return contrincante.jugarContraPiedra();
	}

	// Cuando me desafian me llaman con estos metodos:
	public String jugarContraPiedra() {
		return "Empate";
	}
	
	public String jugarContraPapel() {
		return "Gana Papel"; // Pierdo
	}
	
	public String jugarContraTijera() {
		return "Gana Piedra"; // Gano
	}
	
}
