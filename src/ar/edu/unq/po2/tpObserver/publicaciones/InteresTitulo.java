package ar.edu.unq.po2.tpObserver.publicaciones;

public class InteresTitulo extends Interes{

	public InteresTitulo(String interes) {
		super(interes);
	}

	@Override
	public Boolean coincideCon(Articulo articulo) {
		return articulo.getTitulo().equals(this.getInteres());
	}

}
