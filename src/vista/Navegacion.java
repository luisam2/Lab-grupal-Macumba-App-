package vista;

import processing.core.PApplet;

public class Navegacion {
	
	private Button btnUsuario;
	private Button btnHistorial;
	private Button btnMenu;
	private Button btnPedido;
	private PApplet app;
	
	public Navegacion(PApplet app) {
		this.app = app;
		btnHistorial = new Button(this.app, 50, 700, 50, 50, 0, "Historial");
		btnMenu = new Button(this.app, 150,700,50,50,0,"Menu" );
		btnPedido = new Button(this.app, 250,700,50,50,0,"Pedido");
		btnUsuario = new Button(this.app, 350,700,50,50,0,"Usuario");
	}
	
	public void pintar() {
		btnHistorial.pintar();
		btnMenu.pintar();
		btnPedido.pintar();
		btnUsuario.pintar();
	}
	
	public int click() {
		
		if(btnHistorial.isHover()) {
			return 5;
		}
		if(btnMenu.isHover()) {
			return 1;
		}
		if(btnPedido.isHover()) {
			return 4;
		}
		if(btnUsuario.isHover()) {
			return 6;
		}
		return 1;
		
	}
}
