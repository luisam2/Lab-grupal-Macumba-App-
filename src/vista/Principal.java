package vista;

/***import java.io.Console;
import java.io.File;
import java.util.ArrayList;****/

import processing.core.PApplet;
import controlP5.*;

public class Principal extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Principal.class.getName());
	}

	ControlP5 cp5;
	IniciarSesionPantalla inisesPantalla;
	int numeroPantalla;

	@Override
	public void settings() {
		size(375, 812);

	}

	@Override
	public void setup() {
		cp5 = new ControlP5(this);
		numeroPantalla = 0;
		inisesPantalla = new IniciarSesionPantalla(this, cp5, loadImage("./../img/Inicio.png"));
	}

	@Override
	public void draw() {
		
		background(255);
		
		switch (numeroPantalla) {
		case 0:
			inisesPantalla.pintarBackground();
			inisesPantalla.pintarElementos();
			break;
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:

			break;
		default:
			break;
		}
		
		
	}

	public void mousePressed() {
		
		switch (numeroPantalla) {
		case 0:
			inisesPantalla.clickElementos();
			break;
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:

			break;
		default:
			break;
		}
		
	}
}
