package vista;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class HistorialPantalla extends Pantalla{

	private Controlador control;

	public HistorialPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		this.control = new Controlador();
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean clickElementos() {
		return false;
		// TODO Auto-generated method stub
		
	}

}
