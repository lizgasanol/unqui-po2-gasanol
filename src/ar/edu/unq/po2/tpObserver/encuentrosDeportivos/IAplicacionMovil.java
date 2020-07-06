package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

public interface IAplicacionMovil {

	public boolean estaInteresadoEn(EncuentroDeportivo encuentro);

	public void recibirNotificacionDeResultado(EncuentroDeportivo encuentro);

}
