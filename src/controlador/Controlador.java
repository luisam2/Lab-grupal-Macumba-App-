package controlador;

import java.util.ArrayList;

import modelo.Logica;
import modelo.Usuario;

public class Controlador {

	private Logica logica;
	
	public Controlador() {
		this.logica = new Logica();
	}
	
	public void addUsers(String usuario,String contraseña) {
		this.logica.addUser(usuario, contraseña);
	}
	 
	public ArrayList<Usuario> getUsers() {
		return this.logica.getUsuarios();
	}
}
