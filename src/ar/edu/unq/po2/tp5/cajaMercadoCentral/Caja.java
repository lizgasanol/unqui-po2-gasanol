package ar.edu.unq.po2.tp5.cajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
	private List<Producto> productos = new ArrayList<Producto>();

	public void registrarProducto(Producto producto) {
		this.getProductos().add(producto);
		producto.decrementarStock();
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public Double getMontoTotal() {
		Double sumador = 0d;
		for (Producto producto : productos) {
			sumador += producto.getPrecioReal();
		}
		return sumador;
	}

}
