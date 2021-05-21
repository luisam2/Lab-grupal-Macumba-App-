package modelo;

import java.util.ArrayList;

public class Logica {

	ArrayList<Usuario> usuarios;

	public Logica() {
		super();
		usuarios = new ArrayList<>();
	}
	
	public void addUser(String usuario, String contraseña) {
		usuarios.add(new Usuario(usuario, contraseña));
	}
	
	

}
