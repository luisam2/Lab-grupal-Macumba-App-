package modelo;

import java.util.Comparator;

public class CompararPrecio implements Comparator<Carrito>{

	@Override
	public int compare(Carrito arg0, Carrito arg1) {
		// TODO Auto-generated method stub
		return arg0.getPrecioFinal()-arg1.getPrecioFinal();
	}

}