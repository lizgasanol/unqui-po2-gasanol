package ar.edu.unq.po2.tpState.videoJuego;

public class MaquinaDeJuego {
	private Integer fichas;
	private EstadoDeJugadores estadoDeJugadores;
	private EstadoDeMaquina estadoDeMaquina;
	
	public MaquinaDeJuego() {
		this.fichas = 0;
		this.estadoDeJugadores = new EstadoSinJugador();
		this.estadoDeMaquina = new EstadoApagada();
	}

	public Integer getFichas() {
		return fichas;
	}

	public void setFichas(Integer fichas) {
		this.fichas = fichas;
	}

	public EstadoDeJugadores getEstadoDeJugadores() {
		return estadoDeJugadores;
	}

	public void setEstadoDeJugadores(EstadoDeJugadores estadoDeJugadores) {
		this.estadoDeJugadores = estadoDeJugadores;
	}

	public EstadoDeMaquina getEstadoDeMaquina() {
		return estadoDeMaquina;
	}

	public void setEstadoDeMaquina(EstadoDeMaquina estadoDeMaquina) {
		this.estadoDeMaquina = estadoDeMaquina;
	}
	
	public void recibirFicha() {
		this.getEstadoDeMaquina().recibirFicha(this);
	}
	
	public void encenderMaquina() {
		this.getEstadoDeMaquina().encender(this);
	}
	
	public void iniciarJuego() {
		this.getEstadoDeMaquina().iniciarJuego(this);
	}
	
	public void terminarJuego() {
		this.getEstadoDeMaquina().terminarJuego(this);
	}
	
	public Boolean puedenJugarDos() {
		return this.getEstadoDeJugadores().puedenJugarDos();
	}

	public void sumar1Ficha() {
		this.fichas += 1;
	}
}
