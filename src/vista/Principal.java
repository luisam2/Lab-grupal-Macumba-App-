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
	MenuPantalla menuPantalla;
	ProductoPantalla productoPantalla;
	AdicionesPantalla adicionesPantalla;
	HistorialPantalla historialPantalla;
	int numeroPantalla;

	@Override
	public void settings() {
		size(375, 812);

	}

	@Override
	public void setup() {
		cp5 = new ControlP5(this);
		numeroPantalla = 0;
		inisesPantalla = new IniciarSesionPantalla(this, cp5, loadImage("./../img/Inicio.png"), numeroPantalla);
		menuPantalla = new MenuPantalla(this, cp5, loadImage("./../img/base_general.png"), numeroPantalla);
		productoPantalla = new ProductoPantalla(this, cp5, loadImage("./../img/base_general.png"), numeroPantalla,0);
		adicionesPantalla = new AdicionesPantalla(this, cp5, loadImage("./../img/base_general.png"), numeroPantalla);
		historialPantalla = new HistorialPantalla(this, cp5, loadImage("./../img/aprobado_factura.png"), numeroPantalla);
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
			menuPantalla.pintarBackground();
			menuPantalla.pintarElementos();
			break;
		case 2:
			productoPantalla.pintarBackground();
			productoPantalla.pintarElementos();
			break;
		case 3:
			adicionesPantalla.pintarBackground();
			adicionesPantalla.pintarElementos();
			break;
		case 4:
			historialPantalla.pintarBackground();
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
		System.out.println(numeroPantalla);
		switch (numeroPantalla) {
		case 0:
			inisesPantalla.clickElementos();
			numeroPantalla = inisesPantalla.nextScreen(inisesPantalla.controlador);
			break;
		case 1:
			menuPantalla.clickElementos();
			productoPantalla.setIdProducto(menuPantalla.productoSeleccionado());
			productoPantalla.changeProducto();
			numeroPantalla = menuPantalla.nextScreen(menuPantalla.controlador);
			break;
		case 2:
			productoPantalla.clickElementos();
			numeroPantalla = productoPantalla.nextScreen(productoPantalla.controlador);
			break;
		case 3:
			adicionesPantalla.clickElementos();
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
