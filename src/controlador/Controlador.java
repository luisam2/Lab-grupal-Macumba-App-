package controlador;

import java.util.ArrayList;

import modelo.Logica;
import modelo.Producto;
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
	
	public ArrayList<Producto> getProductos() {
		return this.logica.getProductos();
	}
	
	public String getIDSelectedProduct(String id) {
		
		return id;
		
	}
}
