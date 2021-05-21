package controlador;

import java.util.ArrayList;

import modelo.Logica;
import modelo.Usuario;

public class Controlador {

	private Logica logica;
	
	public Controlador() {
		this.logica = new Logica();
	}
	
	public void addUsers(String usuario,String contrase�a) {
		this.logica.addUser(usuario, contrase�a);
	}
	 
	public ArrayList<Usuario> getUsers() {
		return this.logica.getUsuarios();
	}
}
