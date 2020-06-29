package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public abstract class Producto {

	private Double precio;
	private Integer stock;
	
	public Producto(Double precio, Integer stock) {
		this.setPrecio(precio);
		this.setStock(stock);
	}

	public abstract Double getPrecioReal();
	
	public Double getPrecio() {
		return this.precio;
	}
	
	protected void setPrecio(Double precio) {
		this.precio = precio;
	}

	protected Integer getStock() {
		return stock;
	}

	protected void setStock(Integer stock) {
		this.stock = stock;
	}

	protected void decrementarStock() {
		this.setStock(this.getStock() - 1);
	}
}
