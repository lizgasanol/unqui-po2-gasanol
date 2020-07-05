package ar.edu.unq.po2.tpObserver.publicaciones;
 
public interface IObservadorArticulos {

	public void recibirNotificacion(Articulo articulo);
	public boolean estaInteresadoEn(Articulo articulo);

}
