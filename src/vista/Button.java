package vista;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PFont;

public class Button {

	private PApplet app;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private int tipo;
	private String textInfo;
	private PFont font;

	public Button(PApplet app, int posX, int posY, int tamX, int tamY, int tipo, String textInfo) {
		super();
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.tipo = tipo;
		this.textInfo = textInfo;
		
		this.font = this.app.createFont("./font/GorditaMedium.otf", 14);
		
		this.app.textFont(this.font);
	}

	public void pintar() {
		
		this.app.rectMode(PConstants.CENTER);
		this.app.textAlign(PConstants.CENTER,PConstants.CENTER);
		this.app.textSize(16);
		this.app.noStroke();
		switch (this.tipo) {
		case 0:
			this.app.fill(255,112,51);
			this.app.rect(posX, posY, tamX, tamY);
			this.app.fill(255);
			this.app.text(this.textInfo, posX, posY);
			break;
		case 1:
			this.app.fill(255);
			this.app.rect(posX, posY, tamX, tamY);
			this.app.fill(255,112,51);
			this.app.text(this.textInfo, posX, posY);
			break;
		
		}
	}
	
	public boolean isHover() {
		boolean isSobre = false;
	      
        if (
            this.app.mouseX > (this.posX - (this.tamX / 2)) &&
            this.app.mouseX < (this.posX + (this.tamX / 2)) &&
            this.app.mouseY > (this.posY - (this.tamY / 2)) &&
            this.app.mouseY < (this.posY + (this.tamY / 2))
        ) {
            isSobre = true;
        }
        return isSobre;
	}

}
