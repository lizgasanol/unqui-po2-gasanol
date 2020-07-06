package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Deporte {

	private String deporte;
	private List<EncuentroDeportivo> encuentros = new ArrayList<EncuentroDeportivo>();
	private List<Servidor> servidores = new ArrayList<Servidor>();
	
	private void notificarServidores(EncuentroDeportivo encuentro) {
		for (Servidor servidor : this.servidores) {
			servidor.recibirNotificacionDeEncuentro(encuentro);
		}
	}
	
	public void agregarEncuentro(EncuentroDeportivo encuentro) {
		this.encuentros.add(encuentro);
		this.notificarServidores(encuentro);
	}
	
	public void agregarServidor(Servidor unServidor) {
		this.servidores.add(unServidor);
	}
	
	public String getDeporte() {
		return this.deporte;
	}
}
