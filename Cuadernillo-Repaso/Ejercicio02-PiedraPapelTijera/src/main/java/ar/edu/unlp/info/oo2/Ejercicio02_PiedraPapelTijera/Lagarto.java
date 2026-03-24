package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public class Lagarto implements OpcionDeJuego {

	public String desafiar(OpcionDeJuego contrincante) {
		return contrincante.jugarContraLagarto();
	}

	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	public String jugarContraPapel() {
		return "Gana Lagarto";
	}

	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	public String jugarContraLagarto() {
		return "Empate";
	}

	public String jugarContraSpock() {
		return "Gana Lagarto";
	}

}
