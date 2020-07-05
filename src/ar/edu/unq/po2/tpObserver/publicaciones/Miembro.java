package ar.edu.unq.po2.tpObserver.publicaciones;

import java.util.List;

public class Miembro implements IObservadorArticulos{

	private List<Articulo> articulosInteresantes;
	private List<Interes> intereses;
	
	@Override
	public void recibirNotificacion(Articulo articulo) {
		this.articulosInteresantes.add(articulo);
	}

	@Override
	public boolean estaInteresadoEn(Articulo articulo) {
		Boolean ret = false;
		
		for (Interes interes : this.intereses) {
			ret = ret || interes.coincideCon(articulo);
		}
		
		return ret;
	}
}
