package vista;

import controlP5.ControlP5;
import controlador.Controlador;
import modelo.Producto;
import processing.core.PApplet;
import processing.core.PImage;

public class HistorialPantalla extends Pantalla {

	private Controlador control;
	private Button nuevaOrden;

	public HistorialPantalla(PApplet app, ControlP5 cp5, PImage imgBackground, int controlador) {
		super(app, cp5, imgBackground, controlador);
		// TODO Auto-generated constructor stub
		this.control = new Controlador();
		this.nuevaOrden = new Button(app, getTamX() / 2, 700, 200, 40, 0, "Finalizar Orden");
	}

	@Override
	public void pintarElementos() {
		// TODO Auto-generated method stub
		this.app.fill(0);
		this.app.textSize(16);
		this.app.text("Producto", 100, 250);
		this.app.text("Precio", 200, 250);
		this.app.text("Cantidad", 300, 250);
		this.app.textSize(13);
		for (int i = 0; i < this.control.getPedidoActual().size(); i++) {

			this.app.text(this.control.getPedidoActual().get(i).getName(), 100, (i * 30) + 290);
			this.app.text(this.control.getPedidoActual().get(i).getPrice() + ".000", 200, (i * 30) + 290);
			this.app.text(this.control.getPedidoActual().get(i).getCantidad(), 300, (i * 30) + 290);

		}

		this.nuevaOrden.pintar();
	}

	@Override
	public boolean clickElementos() {
		if (nuevaOrden.isHover()) {
			this.control.finalizarPedido();
			return true;
		}
		return false;
		// TODO Auto-generated method stub

	}

	public void click() {
		// TODO Auto-generated method stub

	}

}
