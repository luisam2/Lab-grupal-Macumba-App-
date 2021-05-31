package vista;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlador.Controlador;
import processing.core.PApplet;
import processing.core.PImage;

public class PedidosViejosPantalla extends Pantalla{
	
	private Button precio;
	private Button fecha;
	private Controlador control;
	private ArrayList<VistaCompra> comprasVisibles;
	

	public PedidosViejosPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		this.control = new Controlador();
		this.precio = new Button(app, getTamX() / 2 - 100, 200, 150, 40, 0, "precio");
		this.fecha = new Button(app, getTamX() / 2 + 100, 200, 150, 40, 2, "fecha",app.loadImage("./../img/fecha.png"));
		
		comprasVisibles = new ArrayList<VistaCompra>();
		
		
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		this.precio.pintar();
		this.fecha.pintar();
		if(comprasVisibles.size()!=0) {
			for (int i = 0; i < comprasVisibles.size(); i++) {
				comprasVisibles.get(i).pintar();
			}
		}
		
	}

	@Override
	public boolean clickElementos() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void click() {
		if(this.precio.isHover()) {
			this.control.ordenar("precio");
			System.out.println("dunff");
		}
		
		if(this.fecha.isHover()) {
			this.control.ordenar("fecha");
			System.out.println("sddf");
		}
	}
	
	public  void agregarCompra() {
		for (int i = 0; i < control.getCompras().size(); i++) {
			comprasVisibles.add(new VistaCompra(control.getCompras().get(i), 0,100 ,20+150*i ,100 , 120, app));
		}
	}

}
