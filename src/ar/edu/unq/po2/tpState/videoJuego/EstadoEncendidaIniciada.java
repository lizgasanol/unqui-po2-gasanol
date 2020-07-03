package ar.edu.unq.po2.tpState.videoJuego;

public class EstadoEncendidaIniciada implements EstadoDeMaquina {

	@Override
	public void recibirFicha(MaquinaDeJuego maquinaDeJuego) {
	}

	@Override
	public void encender(MaquinaDeJuego maquinaDeJuego) {
	}

	@Override
	public void iniciarJuego(MaquinaDeJuego maquinaDeJuego) {
	}

	@Override
	public void terminarJuego(MaquinaDeJuego maquinaDeJuego) {
		maquinaDeJuego.setEstadoDeJugadores(new EstadoSinJugador());
		maquinaDeJuego.setEstadoDeMaquina(new EstadoEncendidaIdle());
	}

}
