package ar.edu.unq.po2.tpObserver.publicaciones;

public class InteresTipoDeArticulo extends Interes{

	public InteresTipoDeArticulo(String interes) {
		super(interes);
	}

	@Override
	public Boolean coincideCon(Articulo articulo) {
		return articulo.getTipoDeArticulo().equals(this.getInteres());
	}

}
