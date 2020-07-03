package ar.edu.unq.po2.tpState.reproductorMp3;

public class EstadoStop implements IEstadoDeReproduccion {

	@Override
	public void play(Reproductor reproductor, Song song) throws Exception {
		reproductor.setEstadoDeReproduccion(new EstadoPlay());
		reproductor.setCancionActual(song);
		song.play();
	}

	@Override
	public void pause(Reproductor reproductor) throws Exception {
		throw new Exception("No hay nada reproduciendose");
	}

	@Override
	public void stop(Reproductor reproductor) {
	}

}
