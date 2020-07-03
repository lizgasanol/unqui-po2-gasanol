package ar.edu.unq.po2.tpState.reproductorMp3;

public class EstadoPause implements IEstadoDeReproduccion{

	@Override
	public void play(Reproductor reproductor, Song song) throws Exception {
		throw new Exception("Ya hay una cancion en reproduccion!");
	}

	@Override
	public void pause(Reproductor reproductor) throws Exception {
		reproductor.setEstadoDeReproduccion(new EstadoPlay());
		reproductor.getCancionActual().play();
	}

	@Override
	public void stop(Reproductor reproductor) {
		reproductor.setEstadoDeReproduccion(new EstadoStop());
		reproductor.getCancionActual().stop();
		reproductor.setCancionActual(null);
	}

}
