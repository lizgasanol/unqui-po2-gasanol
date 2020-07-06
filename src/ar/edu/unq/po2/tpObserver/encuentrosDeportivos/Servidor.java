package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Servidor {
	
	private List<EncuentroDeportivo> encuentros = new ArrayList<EncuentroDeportivo>();
	private List<IAplicacionMovil> oyentes = new ArrayList<IAplicacionMovil>();

	public void recibirNotificacionDeEncuentro(EncuentroDeportivo encuentro) {
		this.agregarEncuentro(encuentro);
		this.notificarOyentes(encuentro);
	}

	private void notificarOyentes(EncuentroDeportivo encuentro) {
		for(IAplicacionMovil oyente : oyentes) {
			this.enviarNotificacionSiInteresado(oyente,encuentro);
		}
	}

	private void enviarNotificacionSiInteresado(IAplicacionMovil oyente, EncuentroDeportivo encuentro) {
		if(oyente.estaInteresadoEn(encuentro)) {
			oyente.recibirNotificacionDeResultado(encuentro);
		}
	}

	private void agregarEncuentro(EncuentroDeportivo encuentro) {
		this.encuentros.add(encuentro);
	}

	public void agregarOyente(IAplicacionMovil oyente) {
		this.oyentes.add(oyente);
	}
}
