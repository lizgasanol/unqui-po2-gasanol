package ar.edu.unq.po2.tpTDD.poker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {
	
	private List<Jugada> jugadas;

	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> listaDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		Jugada jugadaPresente = new JugadaVacia();
		if (this.hayPoquer(listaDeCartas)) {
			return "Poquer";
		} 
		
		if (this.hayColor(listaDeCartas)) {
			return "Color";
		}
		
		if (this.hayTrio(listaDeCartas)) {
			return "Trio";
		}
		
		return "Nada";
	}

	private boolean hayTrio(List<Carta> listaDeCartas) {
		return this.hayValorConOcurrencias(this.valoresYOcurrencias(listaDeCartas),3);
	}

	private boolean hayColor(List<Carta> listaDeCartas) {
		String colorDePrimeraCarta = listaDeCartas.get(0).getPalo();
		return this.todasLasCartasTienenPalo(listaDeCartas, colorDePrimeraCarta);
	}

	private boolean todasLasCartasTienenPalo(List<Carta> listaDeCartas, String colorDePrimeraCarta) {
		Boolean ret = true;
		
		for(Carta carta : listaDeCartas) {
			ret = ret && colorDePrimeraCarta.equals(carta.getPalo());
		}
		
		return ret;
	}
	
	private Boolean hayPoquer(List<Carta> cartas) {	
		return this.hayValorConOcurrencias(this.valoresYOcurrencias(cartas),4);
	}
	
	private Boolean hayValorConOcurrencias(Map<String, Integer> valoresYOcurrencias, int i) {
		return valoresYOcurrencias.containsValue(i);
	}

	private Map<String,Integer> valoresYOcurrencias(List<Carta> cartas){
		Map <String,Integer> ocurrenciasDeValor = new HashMap<String,Integer>();
		
		for(Carta carta : cartas) {
			String clave = carta.getValor();
			if(ocurrenciasDeValor.containsKey(clave)) {
				Integer cantidadDeOcurrencias = ocurrenciasDeValor.get(clave);
				ocurrenciasDeValor.put(clave, cantidadDeOcurrencias + 1);
			} else {
				ocurrenciasDeValor.put(clave, 1);
			}
		}
		
		return ocurrenciasDeValor;
	}
}
