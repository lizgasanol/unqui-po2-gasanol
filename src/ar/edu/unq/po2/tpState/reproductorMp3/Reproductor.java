package ar.edu.unq.po2.tpState.reproductorMp3;

public class Reproductor {
	
	private Song cancionActual;
	private IEstadoDeReproduccion estadoDeReproduccion;

	public Song getCancionActual() {
		return cancionActual;
	}
	public void setCancionActual(Song cancionActual) {
		this.cancionActual = cancionActual;
	}
	public IEstadoDeReproduccion getEstadoDeReproduccion() {
		return estadoDeReproduccion;
	}
	public void setEstadoDeReproduccion(IEstadoDeReproduccion estadoDeReproduccion) {
		this.estadoDeReproduccion = estadoDeReproduccion;
	}
	
	public Reproductor() {
		this.cancionActual = null;
		this.estadoDeReproduccion = new EstadoStop();
	}
	
	public void play(Song song) throws Exception{
		try {
			estadoDeReproduccion.play(this, song);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void pause() throws Exception {
		try {
			estadoDeReproduccion.pause(this);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void stop() {
		estadoDeReproduccion.stop(this);
	}
}
