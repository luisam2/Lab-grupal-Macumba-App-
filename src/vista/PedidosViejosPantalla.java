package vista;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class PedidosViejosPantalla extends Pantalla{
	
	private Button precio;
	private Button fecha;
	private Controlador control;

	public PedidosViejosPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		this.control = new Controlador();
		this.precio = new Button(app, getTamX() / 2 - 100, 200, 150, 40, 2, "precio");
		this.fecha = new Button(app, getTamX() / 2 + 100, 200, 150, 40, 2, "fecha",app.loadImage("./../img/fecha.png"));
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		this.precio.pintar();
		this.fecha.pintar();
		for (int i = 0; i < this.control.getCompras().size(); i++) {
			
		}
	}

	@Override
	public boolean clickElementos() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void click() {
		if(this.precio.isHover()) {
			this.control.ordenar("precio");
		}
		
		if(this.fecha.isHover()) {
			this.control.ordenar("fecha");
		}
	}

}
