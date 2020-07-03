package ar.edu.unq.po2.tpObserver.publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<IObservadorArticulos> observadores = new ArrayList<IObservadorArticulos>();
	
	public void agregarObservador(IObservadorArticulos observador) {
		this.observadores.add(observador);
	}
	
	public void agregarArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		this.notificarObservadores(articulo);
	}

	private void notificarObservadores(Articulo articulo) {
		for (IObservadorArticulos ob : this.observadores) {
			if(articulo.esInteresantePara(ob)) {
				ob.recibirNotificacion(articulo);
			}
		}
	}
}
