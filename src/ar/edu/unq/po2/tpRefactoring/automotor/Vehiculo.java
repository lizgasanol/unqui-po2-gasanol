package ar.edu.unq.po2.tpRefactoring.automotor;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}

	public Boolean debeRealizarVtv(LocalDate fecha) {
		return (!esVehiculoPolicial && this.tieneMenosDeUnAñoDeAntiguedad(fecha)
				&& this.esRadicuadoEnbuenosAires());
	}
	
	private Boolean tieneMenosDeUnAñoDeAntiguedad(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(fechaFabricacion);
	}
	
	private Boolean esRadicuadoEnbuenosAires() {
		return ciudadRadicacion == "Buenos Aires";
	}
}
