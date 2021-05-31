package vista;

import controlP5.ControlP5;
import controlador.Controlador;
import modelo.Producto;
import processing.core.PApplet;
import processing.core.PImage;

public class ProductoPantalla extends Pantalla{
	
	private Button agregar;
	private int idProducto;
	private PImage imgProducto;
	private Controlador control;

	public ProductoPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador, int idProducto) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		agregar = new Button(app, getTamX()/2, 700, 200, 40, 0, "Agregar");
		this.idProducto = idProducto;
		this.control = new Controlador();
		
		changeProducto();
	}

	

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		this.app.image(imgProducto, this.tamX/2, this.tamY/2,this.tamX,this.tamY);
		agregar.pintar();
		
	}

	@Override
	public boolean clickElementos() {
		// TODO Auto-generated method stub
		if(agregar.isHover()) {
			
			for (Producto iterable : this.control.getProductos() ) {
				if(iterable.getID() == this.idProducto) {
					this.control.addProductos(iterable);
				}
			}
			return true;
			
		}
		return false;
	}
	
	public void changeProducto() {
		switch(this.idProducto) {
		case 0:
			this.imgProducto = this.app.loadImage("./../img/plato1.png");
			break;
		case 1:
			this.imgProducto = this.app.loadImage("./../img/plato2.png");
			break;
		case 2:
			this.imgProducto = this.app.loadImage("./../img/plato3.png");
			break;
		case 3:
			this.imgProducto = this.app.loadImage("./../img/plato4.png");
			break;
		}
	}
	
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public PImage getImgProducto() {
		return imgProducto;
	}

	public void setImgProducto(PImage imgProducto) {
		this.imgProducto = imgProducto;
	}

}
