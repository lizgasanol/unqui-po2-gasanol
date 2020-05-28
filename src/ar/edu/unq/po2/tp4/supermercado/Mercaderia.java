package ar.edu.unq.po2.tp4.supermercado;

public abstract class Mercaderia {
	
	private Double precioBase;
	private String nombre;
	private Boolean esParteDePreciosCuidados;

	public Mercaderia(String nombre, Double precioBase, Boolean esParteDePreciosCuidados) {
		super();
		this.setPrecioBase(precioBase);
		this.setNombre(nombre);
		this.setEsParteDePreciosCuidados(esParteDePreciosCuidados);
	}
	
	public Mercaderia(String nombre, Double precioBase) {
		super();
		this.setNombre(nombre);
		this.setPrecioBase(precioBase);
		this.setEsParteDePreciosCuidados(false);
	}
	
	public abstract Double getPrecio();
	
	protected Double getPrecioBase() {
		return precioBase;
	}
	
	private void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean esPrecioCuidado() {
		return esParteDePreciosCuidados;
	}
	private void setEsParteDePreciosCuidados(Boolean esParteDePreciosCuidados) {
		this.esParteDePreciosCuidados = esParteDePreciosCuidados;
	}
	
	public void aumentarPrecio(Double suma) {
		this.setPrecioBase(this.getPrecioBase() + suma);
	}
	
}
