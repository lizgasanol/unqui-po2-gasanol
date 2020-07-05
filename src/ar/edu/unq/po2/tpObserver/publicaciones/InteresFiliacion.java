package ar.edu.unq.po2.tpObserver.publicaciones;

public class InteresFiliacion extends Interes{

	public InteresFiliacion(String interes) {
		super(interes);
	}

	@Override
	public Boolean coincideCon(Articulo articulo) {
		return articulo.getFiliacion().equals(this.getInteres());
	}

}
