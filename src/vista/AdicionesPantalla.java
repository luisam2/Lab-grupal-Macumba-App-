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
	private Button agregar;

	public AdicionesPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		bebidasBtn = new Button(app, getTamX() / 2 - 100, 200, 150, 40, 2, "Bebidas", app.loadImage("./../img/bebidas_select.png"));
		pasabocasBtn = new Button(app, getTamX() / 2 + 100, 200, 150, 40, 2, "Pasabocas",app.loadImage("./../img/pasabocas.png"));
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
		
		this.agregar =  new Button(app, getTamX()/2, 700, 200, 40, 0, "Agregar");
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
		
		agregar.pintar();

	}

	@Override
	public boolean clickElementos() {
		// TODO Auto-generated method stub
		if (bebidasBtn.isHover()) {
			isPasabocas = false;
			bebidasBtn.setImg(app.loadImage("./../img/bebidas_select.png"));
			pasabocasBtn.setImg(app.loadImage("./../img/pasabocas.png"));
			
		}

		if (pasabocasBtn.isHover()) {
			isPasabocas = true;
			bebidasBtn.setImg(app.loadImage("./../img/bebidas.png"));
			pasabocasBtn.setImg(app.loadImage("./../img/pasabocas_select.png"));
		}
		
		for (VistaProducto vistaProducto : adicionesBebidasVista) {
			vistaProducto.click();
		}
		
		for (VistaProducto vistaProducto : adicionesPasabocasVista) {
			vistaProducto.click();
		}
		
		if(agregar.isHover()) {
			añadirAdiciones();
			return true;
		}
		return false;
	}
	
	public void añadirAdiciones() {
		for (VistaProducto vistaProducto : adicionesBebidasVista) {
			if(vistaProducto.getProducto().getCantidad()>0) {
				this.control.addProductos(vistaProducto.getProducto());
			}
			
		}
		
		for (VistaProducto vistaProducto : adicionesPasabocasVista) {
			if(vistaProducto.getProducto().getCantidad()>0) {
				this.control.addProductos(vistaProducto.getProducto());
			}
			
		}
	}

}
