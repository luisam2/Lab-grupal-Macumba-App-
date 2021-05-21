package controlador;

import java.util.ArrayList;

import modelo.Logica;
import modelo.Usuario;

public class Controlador {

	private Logica logica;
	
	public Controlador() {
		this.logica = new Logica();
	}
	
	public void addUsers(String usuario,String contraseņa) {
		this.logica.addUser(usuario, contraseņa);
	}
	 
	public ArrayList<Usuario> getUsers() {
		return this.logica.getUsuarios();
	}
}
