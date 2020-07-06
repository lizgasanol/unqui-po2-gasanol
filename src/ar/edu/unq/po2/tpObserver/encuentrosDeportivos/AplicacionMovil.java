package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

import java.util.List;

public class AplicacionMovil implements IAplicacionMovil {
	
	private List<Interes> intereses;
	private List<String> notificaciones;

	@Override
	public boolean estaInteresadoEn(EncuentroDeportivo encuentro) {
		Boolean ret = false;
		
		for(Interes interes : this.intereses) {
			ret = ret || interes.coincideCon(encuentro);
		}
		
		return ret;
	}

	@Override
	public void recibirNotificacionDeResultado(EncuentroDeportivo encuentro) {
		this.notificaciones.add(encuentro.getResultado());
	}
	
}
