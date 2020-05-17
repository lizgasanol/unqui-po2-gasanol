package ar.edu.unq.po2.restaurant;

public class PlatoGourmet extends Plato {

	private Cheff cheff;
	
	public Cheff getCheff() {
		return cheff;
	}

	public void setCheff(Cheff cheff) {
		this.cheff = cheff;
	}

	public PlatoGourmet(String nombre, Integer cantidadIngredientes, Float precioBase) {
		super(nombre, cantidadIngredientes, precioBase);
	}

	private Integer getRankingDelCheff() {
		return this.getCheff().getRanking();
	}
	
	@Override
	public Float getPrecio() {
		return this.getPrecioBase() + (this.getRankingDelCheff()*100);
	}
	
}
