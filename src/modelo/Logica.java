package modelo;

import java.util.ArrayList;

public class Logica {

	ArrayList<Usuario> usuarios;

	public Logica() {
		super();
		usuarios = new ArrayList<>();
	}
	
	public void addUser(String usuario, String contraseņa) {
		usuarios.add(new Usuario(usuario, contraseņa));
	}
	
	

}
