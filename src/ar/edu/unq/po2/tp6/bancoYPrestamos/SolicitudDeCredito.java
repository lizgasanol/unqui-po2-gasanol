package ar.edu.unq.po2.tp6.bancoYPrestamos;

public abstract class SolicitudDeCredito {
	
	private Double montoSolicitado;
	private Integer plazoEnMeses;
	private Cliente cliente;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, Integer plazo) {
		this.setMontoSolicitado(monto);
		this.setPlazoEnMeses(plazo);
		this.setCliente(cliente);
	}
	
	public Double cuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazoEnMeses();
	}
	
	public abstract Boolean esAceptable();

	public Double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(Double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(Integer plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
