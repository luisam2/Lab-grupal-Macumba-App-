package vista;

import modelo.Carrito;
import modelo.Producto;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class VistaCompra {
	private PApplet app;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private int tipo;
	private Carrito compra;
	private PImage img;
	
	public VistaCompra(Carrito compra, int tipo, int posX, int posY, int tamX, int tamY,  PApplet app) {
		super();
		this.compra = compra;
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.tipo = tipo;


	}
	
	public void pintar() {
		this.app.imageMode(PConstants.CENTER);
		this.app.rectMode(PConstants.CENTER);
		this.app.textAlign(PConstants.CENTER, PConstants.CENTER);
		switch (this.tipo) {
		case 0:
			
				this.app.fill(180);
				this.app.rect( posX, posY, tamX, tamY);
				this.app.fill(0);
				this.app.textSize(14);
				this.app.text(this.compra.getFecha(), posX + 5, posY+ tamY/9);
				this.app.textSize(16);
				this.app.text(this.compra.getPrecioFinal(), posX + 5, posY+ tamY/4);
				this.app.textSize(12);
				for (int i = 0; i < this.compra.getProductos().size(); i++) {
					this.app.text(this.compra.getProductos().get(i).getName(), posX + 5, posX+ 20 + (i*5));
				}
			
			
			break;
		case 1:
		
			break;
		case 2:
			break;

		}
		

		
		
	}
}
