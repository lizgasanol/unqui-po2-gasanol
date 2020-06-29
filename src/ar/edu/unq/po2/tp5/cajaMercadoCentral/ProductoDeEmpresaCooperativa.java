package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class ProductoDeEmpresaCooperativa extends Producto {

	public ProductoDeEmpresaCooperativa(Double precio, Integer cantidadDeStock) {
		super(precio, cantidadDeStock);
	}

	@Override
	public Double getPrecioReal() {
		return this.getPrecio() * 0.9;
	}
}
