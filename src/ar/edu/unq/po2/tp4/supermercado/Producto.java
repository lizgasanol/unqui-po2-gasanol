package ar.edu.unq.po2.tp4.supermercado;

public class Producto extends Mercaderia {

	public Producto(String nombre, Double precioBase, Boolean esParteDePreciosCuidados) {
		super(nombre, precioBase, esParteDePreciosCuidados);
	}
	
	public Producto(String nombre, Double precioBase) {
		super(nombre, precioBase);
	}

	public Double getPrecio() {
		return this.getPrecioBase();
	}
}
