package vista;

import controlP5.ControlP5;
import processing.core.PApplet;
import processing.core.PImage;

public class ProductoPantalla extends Pantalla{
	
	private Button agregar;
	private int idProducto;
	private PImage imgProducto;

	public ProductoPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador, int idProducto) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		agregar = new Button(app, getTamX()/2, 700, 200, 40, 0, "Agregar");
		this.idProducto = idProducto;
		
		changeProducto();
	}

	

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		this.app.image(imgProducto, this.tamX/2, this.tamY/2,this.tamX,this.tamY);
		agregar.pintar();
		
	}

	@Override
	public void clickElementos() {
		// TODO Auto-generated method stub
		if(agregar.isHover()) {
			this.controlador = passScreen(1);
			System.out.println(this.controlador);
		}
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
