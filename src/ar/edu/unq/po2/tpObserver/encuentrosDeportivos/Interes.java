package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

public abstract class Interes {

	private String interes;
	
	// template method
	public abstract boolean coincideCon(EncuentroDeportivo encuentro);
	
	public String getInteres() {
		return this.interes;
	}

}
