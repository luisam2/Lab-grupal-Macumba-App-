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

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
