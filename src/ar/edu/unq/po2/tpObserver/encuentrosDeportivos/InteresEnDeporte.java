package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

public class InteresEnDeporte extends Interes {

	@Override
	public boolean coincideCon(EncuentroDeportivo encuentro) {
		return encuentro.getDeporte().equals(this.getInteres());
	}



}
