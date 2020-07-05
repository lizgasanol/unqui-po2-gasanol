package ar.edu.unq.po2.tpObserver.publicaciones;

public class InteresPalabrasClave extends Interes{

	public InteresPalabrasClave(String interes) {
		super(interes);
	}

	@Override
	public Boolean coincideCon(Articulo articulo) {
		Boolean ret = false;
		
		for (String palabra : articulo.getPalabrasClave()) {
			ret = ret || palabra.equals(this.getInteres());
		}
		
		return ret;
	}

}
