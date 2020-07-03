package ar.edu.unq.po2.tpState.videoJuego;

public class EstadoEncendidaIdle implements EstadoDeMaquina {

	@Override
	public void recibirFicha(MaquinaDeJuego maquinaDeJuego) {
		if(maquinaDeJuego.getFichas() > 1) {
			maquinaDeJuego.setEstadoDeJugadores(new EstadoDosJugadores());
		} else {
			maquinaDeJuego.setEstadoDeJugadores(new EstadoUnJugador());
		}
		
		maquinaDeJuego.sumar1Ficha();
	}

	@Override
	public void encender(MaquinaDeJuego maquinaDeJuego) {		
	}

	@Override
	public void iniciarJuego(MaquinaDeJuego maquinaDeJuego) {
		maquinaDeJuego.setEstadoDeMaquina(new EstadoEncendidaIniciada());
	}

	@Override
	public void terminarJuego(MaquinaDeJuego maquinaDeJuego) {
	}

}
