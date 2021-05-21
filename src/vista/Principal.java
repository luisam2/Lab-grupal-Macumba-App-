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
	@Override
	public void settings() {
		size(375, 812);
		
	}
	
	
	@Override
	public void setup() {
		cp5 = new ControlP5(this);
		inisesPantalla = new IniciarSesionPantalla(this, cp5, loadImage("./../img/Inicio.png"));
	}
	
	@Override
	public void draw() {
		background(255);
		inisesPantalla.pintarBackground();
		inisesPantalla.pintarElementos();
	}
	
	public void mousePressed() {
		inisesPantalla.clickElementos();
	}
}
