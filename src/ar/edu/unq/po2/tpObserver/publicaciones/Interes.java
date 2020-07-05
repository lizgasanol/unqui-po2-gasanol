package ar.edu.unq.po2.tpObserver.publicaciones;

public abstract class Interes {

	private String interes;
	
	public Interes(String interes) {
		this.interes=interes;
	}
	
	public String getInteres() {
		return this.interes;
	}
	
	public abstract Boolean coincideCon(Articulo articulo);
}
