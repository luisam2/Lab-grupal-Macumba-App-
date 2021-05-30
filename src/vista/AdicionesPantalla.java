package vista;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class AdicionesPantalla extends Pantalla {

	Button bebidasBtn;
	Button pasabocasBtn;
	Button continuarBtn;
	private ArrayList<VistaProducto> adicionesPasabocasVista;
	private ArrayList<VistaProducto> adicionesBebidasVista;
	private Controlador control;
	private boolean isPasabocas;

	public AdicionesPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		bebidasBtn = new Button(app, getTamX() / 2 - 100, 200, 150, 40, 0, "Bebidas");
		pasabocasBtn = new Button(app, getTamX() / 2 + 100, 200, 150, 40, 0, "Pasabocas");
		control = new Controlador();
		adicionesPasabocasVista = new ArrayList<VistaProducto>();
		adicionesBebidasVista = new ArrayList<VistaProducto>();
		isPasabocas = false;

		for (int i = 0; i < control.getAdiciones().size(); i++) {
			if (control.getAdiciones().get(i).getTipo().equals("pasabocas")) {
				adicionesPasabocasVista
						.add(new VistaProducto(control.getAdiciones().get(i), 0, 100, 20 + 150 * i, 100, 120, app));
			}
		}

		for (int i = 0; i < control.getAdiciones().size(); i++) {
			if (control.getAdiciones().get(i).getTipo().equals("bebida")) {
				adicionesBebidasVista
						.add(new VistaProducto(control.getAdiciones().get(i), 0, 100, 20 + 150 * i, 100, 120, app));
			}
		}
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		if (isPasabocas) {
			for (VistaProducto vistaProducto : adicionesPasabocasVista) {
				vistaProducto.pintar();
			}
		} else {
			for (VistaProducto vistaProducto : adicionesBebidasVista) {
				vistaProducto.pintar();
			}
		}

		bebidasBtn.pintar();
		pasabocasBtn.pintar();

	}

	@Override
	public void clickElementos() {
		// TODO Auto-generated method stub
		if (bebidasBtn.isHover()) {
			isPasabocas = false;
		}

		if (pasabocasBtn.isHover()) {
			isPasabocas = true;
		}
	}

}
