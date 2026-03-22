package ar.edu.unlp.info.oo2.Ejercicio01_RedSocial;

public class Retweet {
	private Tweet tweetOrigen;
	
	public Retweet(Tweet original) {
		this.tweetOrigen = original;
	}
	
	public Tweet getOriginal() {
		return this.tweetOrigen;
	}
}
