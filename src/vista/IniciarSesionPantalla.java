package vista;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class IniciarSesionPantalla extends Pantalla{
	
	private Input usuario;
	private Input contrase�a;
	private Button ingresar;

	public IniciarSesionPantalla(PApplet app, ControlP5 cp5, PImage imgBackground) {
		super(app,cp5, imgBackground);
		// TODO Auto-generated constructor stub
		usuario =  new Input(cp5, app, 0, getTamX()/4, 300, 200, 25, "usuario");
		contrase�a =  new Input(cp5, app, 0, getTamX()/4, 350, 200, 25, "contrase�a");
		ingresar = new Button(app, getTamX()/2, 500, 200, 40, 0, "Ingresar");
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		usuario.pintar();
		contrase�a.pintar();
		ingresar.pintar();
	}

	@Override
	public void clickElementos() {
		// TODO Auto-generated method stub
		if(ingresar.isHover()) {
			usuario.getInfo();
			contrase�a.getInfo();
			System.out.println(usuario.getInfo() + " " + contrase�a.getInfo());
		}
	}

}
