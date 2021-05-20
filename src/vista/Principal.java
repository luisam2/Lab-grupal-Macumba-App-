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
	Input test;

	@Override
	public void settings() {
		size(375, 812);
		
	}
	
	
	@Override
	public void setup() {
		cp5 = new ControlP5(this);
		test = new Input(cp5, this, 0, 200, 200, 100, 50);
	}
	
	@Override
	public void draw() {
		background(255);
		test.pintar();
		text("sdfd",50,50);
	}
}
