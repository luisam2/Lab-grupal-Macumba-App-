package vista;

import modelo.Producto;
import processing.core.PApplet;
import processing.core.PConstants;

public class VistaProducto {
	
	private PApplet app;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private int tipo;
	private Producto producto;

	public VistaProducto(Producto producto, int tipo, int posX, int posY, int tamX, int tamY,  PApplet app) {
		super();
		this.producto = producto;
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
			this.app.fill(220);
			this.app.rect( posX, posY, tamX, tamY);
			this.app.fill(0);
			this.app.textSize(14);
			this.app.text(this.producto.getName(), posX + tamX/2, posY+ tamY/9);
			this.app.textSize(16);
			this.app.text(this.producto.getPrice(), posX + tamX/2, posY+ tamY/4);
			if(isHover()) {
				
			}
			break;
		case 1:
			
			break;
		case 2:
			break;

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
}
