package ar.edu.unq.po2.tpObserver.publicaciones;

import java.util.List;

public interface IObservadorArticulos {

	public List<String> getIntereses(); 
	public void recibirNotificacion(Articulo articulo);

}
