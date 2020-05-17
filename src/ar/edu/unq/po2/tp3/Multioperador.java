package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> lista = new ArrayList<Integer>();

	public void anadirNumero(int i) {
		this.lista.add(i);
	}

	public Integer sumarLista() {
		Integer sumador = 0;
		for(Integer e : this.lista) {
			sumador += e;
		}
		
		return sumador;
	}

	public Integer restarLista() {
		Integer restador = this.lista.get(0);
		restador = restador + restador;
		for(Integer e : this.lista) {
			restador -= e;
		}
		return restador;
	}

	public Integer multiplicarLista() {
		Integer multiplicador = 1;
		for(Integer e : lista) {
			multiplicador *= e;
		}
		return multiplicador;
	}

}
