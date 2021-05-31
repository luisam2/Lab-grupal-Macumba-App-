package vista;

import modelo.Producto;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class VistaProducto {
	
	private PApplet app;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private int tipo;
	private Producto producto;
	private PImage img;
	private Button añadir;
	private Button quitar;
	private boolean onAñadir;

	public VistaProducto(Producto producto, int tipo, int posX, int posY, int tamX, int tamY,  PApplet app) {
		super();
		this.producto = producto;
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.tipo = tipo;
		this.añadir = new Button(app,posX + 20,posY + 50,20,20,2,"añadir",app.loadImage("./../img/botonmas.png"));
		this.quitar = new Button(app,posX + 50,posY + 50,20,20,2,"quitar",app.loadImage("./../img/botonmenos.png"));
		this.onAñadir = true;

	}
	
	public VistaProducto(Producto producto, int tipo, int posX, int posY, int tamX, int tamY,  PApplet app, PImage img) {
		super();
		this.producto = producto;
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.tipo = tipo;
		this.img = img;
		this.añadir = new Button(app,posX + 20,posY + 50,20,20,2,"añadir",app.loadImage("./../img/botonmas.png"));
		this.quitar = new Button(app,posX + 50,posY + 50,20,20,2,"quitar",app.loadImage("./../img/botonmenos.png"));
		this.onAñadir = true;
	}
	
	
	
	public void pintar() {
		this.app.imageMode(PConstants.CENTER);
		this.app.rectMode(PConstants.CENTER);
		this.app.textAlign(PConstants.CENTER, PConstants.CENTER);
		switch (this.tipo) {
		case 0:
			if(isHover()) {
				this.app.fill(180);
				this.app.rect( posX, posY, tamX, tamY);
				this.app.fill(0);
				this.app.textSize(14);
				this.app.text(this.producto.getName(), posX + 5, posY+ tamY/9);
				this.app.textSize(16);
				this.app.text(this.producto.getPrice(), posX + 5, posY+ tamY/4);
			} else {
				this.app.fill(220);
				this.app.rect( posX, posY, tamX, tamY);
				this.app.fill(0);
				this.app.textSize(14);
				this.app.text(this.producto.getName(), posX + 5, posY+ tamY/9);
				this.app.textSize(16);
				this.app.text(this.producto.getPrice(), posX + 5, posY+ tamY/4);
			}
			
			break;
		case 1:
			if(isHover()) {
				
			} else {
				
			}
			break;
		case 2:
			break;

		}
		
		if(onAñadir) {
			this.añadir.pintar();
			this.quitar.pintar();
			this.app.text(this.producto.getCantidad(),posX + 20,posY + 50);
			
		}
		
		
	}
	
	public boolean isHover() {
		boolean isSobre = false;

		if (	this.app.mouseX > (this.posX - (this.tamX / 2)) && 
				this.app.mouseX < (this.posX + (this.tamX / 2)) && 
				this.app.mouseY > (this.posY - (this.tamY / 2)) && 
				this.app.mouseY < (this.posY + (this.tamY / 2))) {
					isSobre = true;
		}
		return isSobre;
	}
	
	public void click() {
		if(onAñadir) {
			if(añadir.isHover()) {
				this.producto.setCantidad(this.producto.getCantidad()+1);
			}
			if(quitar.isHover()) {
				this.producto.setCantidad(this.producto.getCantidad()-1);
			}
		}
		
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getTamX() {
		return tamX;
	}

	public void setTamX(int tamX) {
		this.tamX = tamX;
	}

	public int getTamY() {
		return tamY;
	}

	public void setTamY(int tamY) {
		this.tamY = tamY;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public PImage getImg() {
		return img;
	}

	public void setImg(PImage img) {
		this.img = img;
	}
}
