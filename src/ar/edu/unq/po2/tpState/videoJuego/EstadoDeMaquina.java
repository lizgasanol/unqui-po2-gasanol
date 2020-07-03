package ar.edu.unq.po2.tpState.videoJuego;

public interface EstadoDeMaquina {

	void recibirFicha(MaquinaDeJuego maquinaDeJuego);

	void encender(MaquinaDeJuego maquinaDeJuego);

	void iniciarJuego(MaquinaDeJuego maquinaDeJuego);

	void terminarJuego(MaquinaDeJuego maquinaDeJuego);

}
