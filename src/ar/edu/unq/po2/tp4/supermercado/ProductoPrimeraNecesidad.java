package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Mercaderia {

	public ProductoPrimeraNecesidad(String nombre, Double precioBase, Boolean esParteDePreciosCuidados) {
		super(nombre, precioBase, esParteDePreciosCuidados);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getPrecio() {
		return this.getPrecioBase() * 0.9;
	}

}
