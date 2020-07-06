package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

public class InteresEnContrincante extends Interes{

	@Override
	public boolean coincideCon(EncuentroDeportivo encuentro) {
		Boolean ret = false;
		
		for (String contrincante : encuentro.getContrincantes()) {
			ret = ret || contrincante.equals(this.getInteres());
		}
		
		return ret;
	}


}
