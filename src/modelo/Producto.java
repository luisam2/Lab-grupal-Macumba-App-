package modelo;

public class Producto {
	
	private String name;
	private String price;
	private int ID;
	private String fileName;
	private int cantidad;
	private String tipo;
	
	public Producto(String name, String price, int iD, String fileName) {
		super();
		this.name = name;
		this.price = price;
		this.ID = iD;
		this.fileName = fileName;
		this.cantidad = 1;
		this.tipo = "plato";
	}
	
	

	public Producto(String name, String price, int iD, String fileName, int cantidad, String tipo) {
		super();
		this.name = name;
		this.price = price;
		this.ID = iD;
		this.fileName = fileName;
		this.cantidad = cantidad;
		this.tipo = tipo;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	

}
