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
	
	public void addUsers(String usuario,String contrase�a) {
		this.logica.addUser(usuario, contrase�a);
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
