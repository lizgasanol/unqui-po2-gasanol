package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaDeProductos;
	
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaDeProductos = new ArrayList<Producto>();
	}


	public Integer getCantidadDeProductos() {
		return listaDeProductos.size();
	}


	public void agregarProducto(Producto p) {
		listaDeProductos.add(p);
	}


	public Double getPrecioTotal() {
		Double sum = 0d;
		
		for(Producto producto : listaDeProductos) {
			sum += producto.getPrecio();
		}
		
		return sum;
	}

	
}
