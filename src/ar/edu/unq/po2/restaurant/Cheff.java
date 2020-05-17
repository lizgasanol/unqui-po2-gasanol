package ar.edu.unq.po2.restaurant;

public class Cheff {
	private String nombre;
	private String apellido;
	private Integer ranking;
	
	public Cheff(String nombre, String apellido, Integer ranking) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.ranking = ranking;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

}
