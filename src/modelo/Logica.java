package modelo;

import java.util.ArrayList;

public class Logica {

	ArrayList<Usuario> usuarios;

	public Logica() {
		super();
		usuarios = new ArrayList<>();
	}
	
	public void addUser(String usuario, String contrase�a) {
		usuarios.add(new Usuario(usuario, contrase�a));
	}
	
	

}
