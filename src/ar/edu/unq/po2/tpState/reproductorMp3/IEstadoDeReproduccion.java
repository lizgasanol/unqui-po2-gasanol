package ar.edu.unq.po2.tpState.reproductorMp3;

public interface IEstadoDeReproduccion {

	void play(Reproductor reproductor, Song song) throws Exception;

	void pause(Reproductor reproductor) throws Exception;

	void stop(Reproductor reproductor);

}
