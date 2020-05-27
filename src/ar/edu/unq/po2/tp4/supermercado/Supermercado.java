package ar.edu.unq.po2.tp4.supermercado;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Mercaderia> listaDeProductos;
	
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaDeProductos = new ArrayList<Mercaderia>();
	}


	public Integer getCantidadDeProductos() {
		return listaDeProductos.size();
	}


	public void agregarProducto(Mercaderia p) {
		listaDeProductos.add(p);
	}


	public Double getPrecioTotal() {
		Double sum = 0d;
		
		for(Mercaderia producto : listaDeProductos) {
			sum += producto.getPrecio();
		}
		
		return sum;
	}

	
}
