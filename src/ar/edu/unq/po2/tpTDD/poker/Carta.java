package ar.edu.unq.po2.tpTDD.poker;

public class Carta {
	
	private String valor;
	private String palo;

	public Carta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}
	
	public String getPalo() {
		return palo;
	}

	public Boolean valeMasQue(Carta carta) {
		
		return this.getValorReal() > carta.getValorReal();
	}

	private Integer getValorReal() {
		switch(this.getValor()) {
		case "K":
			return 13;
		case "Q":
			return 12;
		case "J":
			return 11;
		default: 
			return Integer.parseInt(this.getValor());
		}
	}
}
