package vista;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class MenuPantalla extends Pantalla {
	
	private ArrayList<VistaProducto> productosVisibles;
	private Controlador control;

	public MenuPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		control = new Controlador();
		productosVisibles = new ArrayList<VistaProducto>();
		
		for (int i = 0; i < control.getProductos().size(); i++) {
			productosVisibles.add(new VistaProducto(control.getProductos().get(i), 0,100 ,20+150*i ,100 , 120, app));
		}
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		for (VistaProducto vistaProducto : productosVisibles) {
			vistaProducto.pintar();
		}
	}

	@Override
	public void clickElementos() {
		// TODO Auto-generated method stub
		for (VistaProducto vistaProducto : productosVisibles) {
			if(vistaProducto.isHover()) {
				this.control.getIDSelectedProduct(vistaProducto);
				this.controlador = passScreen(1);
			}
		}
	}

}
