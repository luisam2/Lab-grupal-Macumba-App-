package controlador;

import java.util.ArrayList;

import modelo.Logica;
import modelo.Producto;
import modelo.Usuario;

public class Controlador {

	private Logica logica;
	private int selectedProduct;
	
	public Controlador() {
		this.logica = Logica.getInstancia();
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
	
	public ArrayList<Producto> getAdiciones() {
		return this.logica.getAdiciones();
		
	}
	
	public int getIDSelectedProduct() {
		return selectedProduct;
		
	}
	
	public void setIDselectedProduct(int i) {
		selectedProduct = i;
	}
}