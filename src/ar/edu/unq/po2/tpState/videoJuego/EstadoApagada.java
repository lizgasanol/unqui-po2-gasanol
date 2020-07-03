package ar.edu.unq.po2.tpState.videoJuego;

public class EstadoApagada implements EstadoDeMaquina {

	@Override
	public void recibirFicha(MaquinaDeJuego maquinaDeJuego) {		
	}

	@Override
	public void encender(MaquinaDeJuego maquinaDeJuego) {
		maquinaDeJuego.setEstadoDeMaquina(new EstadoEncendidaIdle());
	}

	@Override
	public void iniciarJuego(MaquinaDeJuego maquinaDeJuego) {
	}

	@Override
	public void terminarJuego(MaquinaDeJuego maquinaDeJuego) {
	}

}
