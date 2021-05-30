package modelo;

import java.util.ArrayList;

public class Logica {

	ArrayList<Usuario> usuarios;
	ArrayList<Producto> productos;
	ArrayList<Producto> adiciones;
	ArrayList<Producto> pedidoActual;
	ArrayList<Carrito> compras;

	private Logica() {
		super();
		usuarios = new ArrayList<>();
		productos = new ArrayList<>();
		adiciones = new ArrayList<Producto>();
		pedidoActual = new ArrayList<Producto>();
		compras = new ArrayList<Carrito>();
		
		productos.add(new Producto("Ceviche", "30", 0, ""));
		productos.add(new Producto("Arroz atollado", "25", 1, ""));
		productos.add(new Producto("Casuela de marriscos", "40", 2, ""));
		productos.add(new Producto("Empanadas de camaron", "10", 3, ""));
		
		adiciones.add(new Producto("Cholado", "10", 0, "",0,"bebida"));
		adiciones.add(new Producto("Champus", "5", 1, "",0,"bebida"));
		adiciones.add(new Producto("Chicha", "5", 2, "",0,"bebida"));
		adiciones.add(new Producto("Limonada", "9", 3, "",0,"bebida"));
		adiciones.add(new Producto("Papas", "10", 4, "",0,"pasabocas"));
		adiciones.add(new Producto("Patacones", "15", 5, "",0,"pasabocas"));
		
	}
	
	protected static Logica logica;
	
	public static Logica getInstancia() {
		if(logica==null) {
			logica = new Logica();
		}
		return logica;
	}
	
	
	public void addUser(String usuario, String contraseña) {
		usuarios.add(new Usuario(usuario, contraseña));
	}
	
	public void addPedidoActual(Producto nuevoElemento) {
		pedidoActual.add(nuevoElemento);
	}
	
	public void confirmarPedido(ArrayList<Producto> pedido) {
		Carrito newCarrito = new Carrito(pedido);
		newCarrito.setPrecioFinal();
		newCarrito.setCantidadElementos();
		compras.add(newCarrito);
		
	}
	
	
	//////////getters y setters

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Producto> getAdiciones() {
		return adiciones;
	}

	public void setAdiciones(ArrayList<Producto> adiciones) {
		this.adiciones = adiciones;
	}


	public ArrayList<Producto> getPedidoActual() {
		return pedidoActual;
	}


	public void setPedidoActual(ArrayList<Producto> pedidoActual) {
		this.pedidoActual = pedidoActual;
	}


	public ArrayList<Carrito> getCompras() {
		return compras;
	}


	public void setCompras(ArrayList<Carrito> compras) {
		this.compras = compras;
	}
	
	

}
