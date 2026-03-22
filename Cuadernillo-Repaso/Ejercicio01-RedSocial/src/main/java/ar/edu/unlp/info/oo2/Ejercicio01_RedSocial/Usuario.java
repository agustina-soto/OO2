package ar.edu.unlp.info.oo2.Ejercicio01_RedSocial;

import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private ArrayList<Tweet> tweets;
	private ArrayList<Retweet> retweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets	= new ArrayList<Tweet>();
		this.retweets = new ArrayList<Retweet>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public ArrayList<Tweet> getTweets() {
		return this.tweets;
	}
	
	public boolean existe(String screenName) {
		return this.screenName.equals(screenName);
	}

	// Elimina los rewteets cuyo tweet original va a ser eliminado
	public void eliminarRetweets(ArrayList<Tweet> tweetsAEliminar) {
		this.retweets.removeIf(r -> tweetsAEliminar.contains(r.getOriginal()));
	}

	public void eliminarContenidoDeCuenta() {
		this.retweets.clear();
		this.tweets.clear();
	}
	
	public boolean cumpleLongitud(String texto) {
		return (texto.length() >= 1) && (texto.length() <= 280);
	}

	public Tweet postear(String texto) {
		Tweet t = null;
		
		if(cumpleLongitud(texto)) {
			t = new Tweet(texto);
			this.tweets.add(t);
		}
		return t;
	}
	
	public Retweet repostear(Tweet t) {
		Retweet r = new Retweet(t);
		this.retweets.add(r);
		return r;
	}
}
