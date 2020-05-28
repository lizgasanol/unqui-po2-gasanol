package ar.edu.unq.po2.tp4.impuestoAlTrabajador;

public abstract class IngresoAbstracto {
	
	private String mesDePercepcion;
	private String concepto;
	private Double montoPercibido;
	
	public IngresoAbstracto(String mesDePercepcion, String concepto, Double montoPercibido) {
		this.setMesDePercepcion(mesDePercepcion);
		this.setConcepto(concepto);
		this.setMontoPercibido(montoPercibido);
	}
	
	private void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}
	
	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	
	private void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public abstract Double getMontoImponible();
	
}
