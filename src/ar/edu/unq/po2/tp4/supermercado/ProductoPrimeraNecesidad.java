package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad {

	private String nombre;
	private double precioBase;
	private boolean esParteDePreciosCuidados;
	
	public ProductoPrimeraNecesidad(String nombre, double precioBase, boolean b) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.esParteDePreciosCuidados = b;
	}

	public Double getPrecio() {
		return precioBase * 0.9;
	}

}
