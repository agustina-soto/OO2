package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public class Spock implements OpcionDeJuego{


	public String desafiar(OpcionDeJuego contrincante) {
		return contrincante.jugarContraSpock();
	}

	public String jugarContraPiedra() {
		return "Gana Spock";
	}

	public String jugarContraPapel() {
		return "Gana Papel";
	}

	public String jugarContraTijera() {
		return "Gana Spock";
	}

	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}

	public String jugarContraSpock() {
		return "Empate";
	}

}
