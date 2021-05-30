package vista;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class AdicionesPantalla extends Pantalla{
	
	Button bebidasBtn;
	Button pasabocasBtn;
	Button continuarBtn;

	public AdicionesPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		bebidasBtn = new Button(app, getTamX()/2-100, 200, 150, 40, 0, "Bebidas");
		pasabocasBtn = new Button(app, getTamX()/2+100, 200, 150, 40, 0, "Pasabocas");
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		bebidasBtn.pintar();
		pasabocasBtn.pintar();
	}

	@Override
	public void clickElementos() {
		// TODO Auto-generated method stub
		
	}

}
