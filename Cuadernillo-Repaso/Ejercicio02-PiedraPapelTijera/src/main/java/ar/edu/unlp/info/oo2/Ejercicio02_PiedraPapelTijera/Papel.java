package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public class Papel implements OpcionDeJuego {

	public String desafiar(OpcionDeJuego contrincante) {
		return contrincante.jugarContraPapel();
	}

	public String jugarContraPiedra() {
		return "Gana Papel";
	}

	public String jugarContraPapel() {
		return "Empate";
	}

	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}
	
	public String jugarContraSpock() {
		return "Gana Papel";
	}
}
