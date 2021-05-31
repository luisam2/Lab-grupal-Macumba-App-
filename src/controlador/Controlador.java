package controlador;

import java.util.ArrayList;

import modelo.Carrito;
import modelo.Logica;
import modelo.Producto;
import modelo.Usuario;

public class Controlador {

	private Logica logica;
	private int selectedProduct;
	
	public Controlador() {
		this.logica = Logica.getInstancia();
	}
	
	public void addUsers(String usuario,String contrase�a) {
		this.logica.addUser(usuario, contrase�a);
	}
	
	public void addProductos(Producto producto) {
		this.logica.addPedidoActual(producto);
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
	
	public ArrayList<Producto> getPedidoActual() {
		return this.logica.getPedidoActual();
		
	}
	
	public ArrayList<Carrito> getCompras() {
		return this.logica.getCompras();
		
	}
	
	
	public int getIDSelectedProduct() {
		return selectedProduct;
		
	}
	
	public void ordenar(String p) {
		this.logica.OrdenarCarrito(p);
	}
	
	public void setIDselectedProduct(int i) {
		selectedProduct = i;
	}

	public void finalizarPedido() {
		// TODO Auto-generated method stub
		this.logica.confirmarPedido(getPedidoActual());
	}
}