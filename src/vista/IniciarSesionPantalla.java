package vista;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class IniciarSesionPantalla extends Pantalla{
	
	private Input usuario;
	private Input contraseña;
	private Button ingresar;
	private Controlador control;

	public IniciarSesionPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app,cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		control = new Controlador();
		usuario =  new Input(cp5, app, 0, getTamX()/4, 300, 200, 25, "usuario");
		contraseña =  new Input(cp5, app, 0, getTamX()/4, 350, 200, 25, "contraseña");
		ingresar = new Button(app, getTamX()/2, 500, 200, 40, 0, "Ingresar");
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		
			usuario.pintar();
			contraseña.pintar();
		
		
		
		
		ingresar.pintar();
		
	}

	@Override
	public void clickElementos() {
		// TODO Auto-generated method stub
		if(ingresar.isHover()) {
			control.addUsers(usuario.getInfo(), contraseña.getInfo());
			this.controlador = passScreen(1);
			if(this.controlador >0) {
				usuario.hideInput();
				contraseña.hideInput();
			}
		}
	}

}
