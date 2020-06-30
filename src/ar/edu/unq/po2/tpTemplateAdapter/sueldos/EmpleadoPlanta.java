package ar.edu.unq.po2.tpTemplateAdapter.sueldos;

public class EmpleadoPlanta extends Empleado {

	public EmpleadoPlanta(Boolean estaCasado, Integer cantidadDeHijos) {
		super(estaCasado, cantidadDeHijos);
	}

	@Override
	protected Double pagoBasico() {
		return 3000d;
	}
	
	@Override
	protected Double pagoFamiliar() {
		return 150d * this.getCantidadDeHijos();
	}
}
