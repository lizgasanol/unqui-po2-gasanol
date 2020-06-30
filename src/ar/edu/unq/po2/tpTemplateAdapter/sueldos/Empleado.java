package ar.edu.unq.po2.tpTemplateAdapter.sueldos;

public abstract class Empleado {
	
	private Boolean estaCasado;
	private Integer cantidadDeHijos;
	private Integer cantidadDeHoras;
	
	public Empleado(Boolean estaCasado, Integer cantidadDeHijos) {
		this.setEstaCasado(estaCasado);
		this.setCantidadDeHijos(cantidadDeHijos);
		this.setCantidadDeHoras(0);
	}

	public Boolean getEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(Boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public Integer getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(Integer cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}
	
	public Integer getCantidadDeHoras() {
		return cantidadDeHoras;
	}

	public void setCantidadDeHoras(Integer cantidadDeHoras) {
		this.cantidadDeHoras = cantidadDeHoras;
	}

	public Double sueldo() {
		return this.sueldoSinDescuentos() - (this.sueldoSinDescuentos() * this.porcentajeDescuentos() / 100);
	}
	
	protected Double sueldoSinDescuentos() {
		return this.pagoBasico() + this.pagoFamiliar() + (this.pagoPorHora() * this.getCantidadDeHoras());
	}
	
	protected Double porcentajeDescuentos() {
		return 13d;
	}
	
	protected Double pagoPorHora() {
		return 0d;
	}
	
	protected Double pagoFamiliar() {
		return 0d;
	}
	
	protected Double pagoBasico() {
		return 0d;
	}
}
