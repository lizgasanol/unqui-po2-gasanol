package ar.edu.unq.po2.tpObserver.publicaciones;

import java.util.List;

public class Miembro implements IObservadorArticulos{

	private List<Articulo> articulosInteresantes;
	private List<String> intereses;
	
	@Override
	public void recibirNotificacion(Articulo articulo) {
		this.articulosInteresantes.add(articulo);
	}

	@Override
	public List<String> getIntereses() {
		return this.intereses;
	}

}
