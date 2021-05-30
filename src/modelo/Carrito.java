package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Carrito {
	
	private int precioFinal;
	private int cantidadElementos;
	private ArrayList<Producto> productos;
	SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
	Date date = new Date(System.currentTimeMillis());
	
private  String fecha;
	
	public Carrito(ArrayList<Producto> pedido) {
		super();
		this.precioFinal = 0;
		this.cantidadElementos = 0;
		this.productos = pedido;
		this.fecha = formatter.format(date);
		
	}
	
	
	
	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal() {
		this.precioFinal = 0;
		for (Producto producto : this.productos) {
			this.precioFinal+= Integer.parseInt(producto.getPrice()) ;
		}
	}

	public int getCantidadElementos() {
		return cantidadElementos;
	}

	public void setCantidadElementos() {
		this.cantidadElementos = this.getProductos().size();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public SimpleDateFormat getFormatter() {
		return formatter;
	}

	public void setFormatter(SimpleDateFormat formatter) {
		this.formatter = formatter;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
}
