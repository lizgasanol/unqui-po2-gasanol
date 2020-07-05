package ar.edu.unq.po2.tpObserver.publicaciones;

public class InteresLugarDePublicacion extends Interes{

	public InteresLugarDePublicacion(String interes) {
		super(interes);
	}

	@Override
	public Boolean coincideCon(Articulo articulo) {
		return articulo.getLugarDePublicacion().equals(this.getInteres());
	}

}
