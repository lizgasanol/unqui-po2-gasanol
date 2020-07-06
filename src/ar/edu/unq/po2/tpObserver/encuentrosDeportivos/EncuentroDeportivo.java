package ar.edu.unq.po2.tpObserver.encuentrosDeportivos;

import java.util.List;

public class EncuentroDeportivo {

	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	public EncuentroDeportivo(String resultado, List<String> unaListaDeContrincantes) {
		this.resultado = resultado;
		this.contrincantes = unaListaDeContrincantes;
	}

	public String getResultado() {
		return resultado;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}
}
