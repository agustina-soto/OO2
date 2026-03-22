package ar.edu.unlp.info.oo2.Ejercicio01_RedSocial;

import java.util.ArrayList;

public class Twitter {
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario agregarUsuario(String screenName) {
		Usuario u = null;
		if(!existeUsuario(screenName)) {
			u = new Usuario(screenName);
			this.usuarios.add(u);
		}
		return u;
	}

	public boolean existeUsuario (String screenName) {
		return this.usuarios.stream()
							.anyMatch(usuario -> usuario.getScreenName().equals(screenName));
	}

	public void eliminarUsuario(Usuario usuarioAEliminar) {
		if ((usuarioAEliminar != null) && (existeUsuario(usuarioAEliminar.getScreenName()))) {
			ArrayList<Tweet> lista = usuarioAEliminar.getTweets();
			this.usuarios.stream()
						.forEach(u -> u.eliminarRetweets(lista));
			
			usuarioAEliminar.eliminarContenidoDeCuenta();
			this.usuarios.remove(usuarioAEliminar);
		}

	}

}
