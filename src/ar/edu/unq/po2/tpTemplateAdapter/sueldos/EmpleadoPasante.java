package ar.edu.unq.po2.tpTemplateAdapter.sueldos;

public class EmpleadoPasante extends Empleado{

	public EmpleadoPasante(Boolean estaCasado, Integer cantidadDeHijos) {
		super(estaCasado, cantidadDeHijos);
	}

	@Override
	protected Double pagoPorHora() {
		return 40d;
	}
}
