package ar.edu.unq.po2.tp6.bancoYPrestamos;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	private String descripcionPropiedad;
	private String direccionPropiedad;
	private Double valorFiscalPropiedad;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, Integer plazo, String descripcionPropiedad,
			String direccionPropiedad, Double valorFiscalPropiedad) {
		super(cliente, monto,plazo);
		this.setDescripcionPropiedad(descripcionPropiedad);
		this.setDireccionPropiedad(direccionPropiedad);
		this.setValorFiscalPropiedad(valorFiscalPropiedad);
	}

	@Override
	public Boolean esAceptable() {
		return ((this.getCliente().getSueldoNetoMensual() * 0.50) >= this.cuotaMensual())
				&& ((this.getValorFiscalPropiedad() * 0.70) >= this.getMontoSolicitado())
				&& ((this.getCliente().getEdad() + (this.getPlazoEnMeses() / 12)) <= 65);
	}

	public String getDescripcionPropiedad() {
		return descripcionPropiedad;
	}

	public void setDescripcionPropiedad(String descripcionPropiedad) {
		this.descripcionPropiedad = descripcionPropiedad;
	}

	public String getDireccionPropiedad() {
		return direccionPropiedad;
	}

	public void setDireccionPropiedad(String direccionPropiedad) {
		this.direccionPropiedad = direccionPropiedad;
	}

	public Double getValorFiscalPropiedad() {
		return valorFiscalPropiedad;
	}

	public void setValorFiscalPropiedad(Double valorFiscalPropiedad) {
		this.valorFiscalPropiedad = valorFiscalPropiedad;
	}

	
}
