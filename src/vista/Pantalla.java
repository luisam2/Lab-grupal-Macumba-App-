package vista;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public abstract class Pantalla {
	protected int posX;
	protected int posY;
	protected int tamX;
	protected int tamY;
	protected PImage imgBackground;
	protected PApplet app;
	
	public Pantalla(PApplet app, PImage imgBackground) {
		this.app = app;
		this.imgBackground = imgBackground;
		this.posX = 0;
		this.posY = 0;
		this.tamX = 375;
		this.tamY = 812;
	}
	
	public void pintarBackground() {
		this.app.imageMode(PConstants.CENTER);
		this.app.image(this.imgBackground, this.tamX/2, this.tamY/2,this.tamX,this.tamY);
	}
	
	public abstract void pintarElementos();
	
	public abstract void clickElementos();

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

	public PImage getImgBackground() {
		return imgBackground;
	}

	public void setImgBackground(PImage imgBackground) {
		this.imgBackground = imgBackground;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
}
