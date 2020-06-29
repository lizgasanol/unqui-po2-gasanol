package ar.edu.unq.po2.tp6.bancoYPrestamos;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	public SolicitudDeCreditoPersonal(Cliente cliente, Double monto, Integer plazo) {
		super(cliente,monto, plazo);
	}

	@Override
	public Boolean esAceptable() {
		return (this.getCliente().calcularSueldoNetoAnual() >= 15000d) 
				&& 
				((this.getCliente().getSueldoNetoMensual() * 0.70) >= this.cuotaMensual());
	}

}
