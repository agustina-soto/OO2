package ar.edu.unlp.info.oo2.Ejercicio02_PiedraPapelTijera;

public interface OpcionDeJuego {

	public String desafiar(OpcionDeJuego contrincante);

	public String jugarContraPiedra();

	public String jugarContraPapel();
	
	public String jugarContraTijera();
	
}
