package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoDeEmpresaTradicional extends Producto {

	public ProductoDeEmpresaTradicional(Double precio, Integer cantidadDeStock) {
		super(precio, cantidadDeStock);
	}

	@Override
	public Double getPrecioReal() {
		return this.getPrecio();
	}
}
