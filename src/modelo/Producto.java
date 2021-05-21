package modelo;

public class Producto {
	
	private String name;
	private String price;
	private int ID;
	private String fileName;
	
	public Producto(String name, String price, int iD, String fileName) {
		super();
		this.name = name;
		this.price = price;
		this.ID = iD;
		this.fileName = fileName;
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
	
	
	
	
	

}
