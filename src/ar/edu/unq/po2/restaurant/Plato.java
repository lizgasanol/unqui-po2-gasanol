package ar.edu.unq.po2.restaurant;

public abstract class Plato {
	
	private String nombre;
	private Integer cantidadIngredientes;
	private Float precioBase;
	private Boolean activo;

	public Plato(String nombre, Integer cantidadIngredientes, Float precioBase) {
		this.setActivo(true);
		this.setCantidadIngredientes(cantidadIngredientes);
		this.setPrecioBase(precioBase);
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadIngredientes() {
		return cantidadIngredientes;
	}

	public void setCantidadIngredientes(Integer cantidadIngredientes) {
		this.cantidadIngredientes = cantidadIngredientes;
	}

	public Float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Float precioBase) {
		this.precioBase = precioBase;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public abstract Float getPrecio();
}
