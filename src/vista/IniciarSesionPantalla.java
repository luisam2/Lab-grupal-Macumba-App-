package vista;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class IniciarSesionPantalla extends Pantalla{
	
	private Input usuario;
	private Input contraseņa;
	private Button ingresar;
	private Controlador control;

	public IniciarSesionPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app,cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		control = new Controlador();
		usuario =  new Input(cp5, app, 0, getTamX()/4, 300, 200, 25, "usuario");
		contraseņa =  new Input(cp5, app, 0, getTamX()/4, 350, 200, 25, "contraseņa");
		ingresar = new Button(app, getTamX()/2, 500, 200, 40, 0, "Ingresar");
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		
			usuario.pintar();
			contraseņa.pintar();
		
		
		
		
		ingresar.pintar();
		
	}

	@Override
	public boolean clickElementos() {
		// TODO Auto-generated method stub
		if(ingresar.isHover()) {
			control.addUsers(usuario.getInfo(), contraseņa.getInfo());
			this.controlador = passScreen(this.controlador+1);
			if(this.controlador >0) {
				usuario.hideInput();
				contraseņa.hideInput();
			}
			return true;
		}
		return false;
	}

}
