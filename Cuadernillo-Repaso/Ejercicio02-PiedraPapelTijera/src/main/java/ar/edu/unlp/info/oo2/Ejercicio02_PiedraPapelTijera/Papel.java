package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public class Papel implements OpcionDeJuego {

	public String desafiar(OpcionDeJuego contrincante) {
		return contrincante.jugarContraPapel();
	}

	public String jugarContraPiedra() {
		return "Gana Papel"; // Gano
	}

	public String jugarContraPapel() {
		return "Empate";
	}

	public String jugarContraTijera() {
		return "Gana Tijera"; // Pierdo
	}

}
