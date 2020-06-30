package ar.edu.unq.po2.tpTemplateAdapter.sueldos;

public class EmpleadoTemporario extends Empleado{

	public EmpleadoTemporario(Boolean estaCasado, Integer cantidadDeHijos) {
		super(estaCasado, cantidadDeHijos);
	}

	@Override
	protected Double pagoPorHora() {
		return 5d;
	}
	
	@Override
	protected Double pagoBasico() {
		return 1000d;
	}
	
	@Override
	protected Double pagoFamiliar() {
		Double ret = 0d;
		
		if (this.getEstaCasado() || this.getCantidadDeHijos() > 0) {
			ret = 100d;
		}
		
		return ret;
	}
}
