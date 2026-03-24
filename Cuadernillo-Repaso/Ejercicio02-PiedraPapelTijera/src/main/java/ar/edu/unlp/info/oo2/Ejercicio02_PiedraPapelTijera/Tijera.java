package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public class Tijera implements OpcionDeJuego {

	public String desafiar(OpcionDeJuego contrincante) {
		return contrincante.jugarContraTijera();
	}

	public String jugarContraPiedra() {
		return "Gana Piedra"; // Pierdo
	}

	public String jugarContraPapel() {
		return "Gana Tijera"; // Pierdo
	}

	public String jugarContraTijera() {
		return "Empate";
	}

}
