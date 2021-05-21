package vista;

import controlP5.ControlP5;
import controlP5.ControllerStyle;
import controlP5.Label;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;

public class Input {
	
	private ControlP5 cp5;
	private PApplet app;
	private int tipo;
	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private PFont font;
	private String textValue;
	private Textfield txtfield;
	
	public Input(ControlP5 cp5, PApplet app, int tipo, int posX, int posY, int tamX, int tamY, String textValue) {
		super();
		this.cp5 = cp5;
		this.app = app;
		this.tipo = tipo;
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.textValue = textValue;
		
		this.font = this.app.createFont("./font/gorditaregular.otf", 14);
		
		this.txtfield = this.cp5.addTextfield(this.textValue)
		.setPosition(this.posX, this.posY)
		.setSize(this.tamX, this.tamY)
		.setFont(this.font)
		.setColor(this.app.color(0));
		
		  // next, get the Label class of that Textlabel  
		  // and make changes to the background like this
		  Label label = this.txtfield.getValueLabel();
		  label.enableColorBackground().setColorBackground(255);

		  // make changes to the style of the controller
		  ControllerStyle style = label.getStyle();
		  style.backgroundWidth = this.tamX+20;
		  style.backgroundHeight = this.tamY;
		  style.setPadding(0, 5, 0, 5);
		
		
		 /* this.cp5.addTextfield("textValue")
		     .setPosition(this.posX, this.posY)
		     .setSize(this.tamX, this.tamY)
		     .setFont(this.font)
		     .setAutoClear(false)
		     ;
		       
		  this.cp5.addBang("clear")
		     .setPosition(this.posX, this.posY)
		     .setSize(this.tamX, this.tamY)
		     .getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		     ;    
		  
		  this.cp5.addTextfield("default")
		     .setPosition(this.posX, this.posY)
		     .setAutoClear(false)
		     ;*/
		     
		
		this.app.textFont(font);
	}

	public void pintar() {
		this.app.fill(255);
		this.app.text(this.cp5.get(Textfield.class,this.textValue).getText(), 360,130);
		 this.app.text(textValue, 360,180);
	}
	
	public String getInfo() {
		return this.txtfield.getText();
	}
	
	public void hideInput() {
		this.txtfield.hide();
	}
	
	
}
