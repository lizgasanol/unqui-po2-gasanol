package ar.edu.unq.po2.tp4.impuestoAlTrabajador;

public class Ingreso extends IngresoAbstracto{

	public Ingreso(String mesDePercepcion, String concepto, Double montoPercibido) {
		super(mesDePercepcion, concepto, montoPercibido);
	}

	@Override
	public Double getMontoImponible() {
		return this.getMontoPercibido();
	}


}
