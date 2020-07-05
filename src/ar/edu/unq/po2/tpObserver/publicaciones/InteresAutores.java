package ar.edu.unq.po2.tpObserver.publicaciones;

public class InteresAutores extends Interes{

	public InteresAutores(String interes) {
		super(interes);
	}

	@Override
	public Boolean coincideCon(Articulo articulo) {
		Boolean ret = false;
		
		for(String autor : articulo.getAutores()) {
			ret = ret || autor.equals(this.getInteres());
		}
		
		return ret;
	}

}
