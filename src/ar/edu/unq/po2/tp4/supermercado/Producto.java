package ar.edu.unq.po2.tp4.supermercado;

public abstract class Producto {

	private String nombre;
	private double precio;
	private boolean esParteDePreciosCuidados;
	
	public Producto(String nombre, double precio, boolean b) {
		this.nombre = nombre;
		this.precio = precio;
		this.esParteDePreciosCuidados = b;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esParteDePreciosCuidados = false;
	}

	public Object getNombre() {
		return nombre;
	}

	public abstract Double getPrecio();
	
	public boolean esPrecioCuidado() {
		return esParteDePreciosCuidados;
	}

	public void aumentarPrecio(double d) {
		this.precio += d;
	}

}
