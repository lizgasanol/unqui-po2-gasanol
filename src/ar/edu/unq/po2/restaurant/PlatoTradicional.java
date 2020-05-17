package ar.edu.unq.po2.restaurant;

public class PlatoTradicional extends Plato {

	public PlatoTradicional(String nombre, Integer cantidadIngredientes, Float precioBase) {
		super(nombre, cantidadIngredientes, precioBase);
	}

	@Override
	public Float getPrecio() {
		Float precio;
		if (this.getCantidadIngredientes()<4) precio = this.getPrecioBase()*1.2f;
		else precio = this.getPrecioBase()*1.4f;
		return precio;
	}

	
}
