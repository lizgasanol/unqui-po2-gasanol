package ar.edu.unq.po2.tp4.impuestoAlTrabajador;

public class IngresoPorHorasExtra extends IngresoAbstracto {
	
	private Integer cantidadDeHorasExtra;

	public IngresoPorHorasExtra(String mes, String concepto, double montoPercibido, int cantidadDeHorasExtra) {
		super(concepto, concepto, montoPercibido);
		this.setCantidadDeHorasExtra(cantidadDeHorasExtra);
	}

	private void setCantidadDeHorasExtra(Integer cantidadDeHorasExtra){
		this.cantidadDeHorasExtra = cantidadDeHorasExtra;
	}
	
	@Override
	public Double getMontoImponible() {
		return 0d;
	}

}
