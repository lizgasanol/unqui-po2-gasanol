package ar.edu.unq.po2.tp4.impuestoAlTrabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<IngresoAbstracto> ingresosPercibidosDelAño = new ArrayList<IngresoAbstracto>();
	
	public void agregrarIngreso(IngresoAbstracto unIngreso) {
		this.getIngresosPercibidosDelAño().add(unIngreso);
	}

	public List<IngresoAbstracto> getIngresosPercibidosDelAño() {
		return this.ingresosPercibidosDelAño;
	}

	public Double getTotalPercibido() {
		Double sumador = 0d;
		
		for (IngresoAbstracto ingreso : this.getIngresosPercibidosDelAño()) {
			sumador += ingreso.getMontoPercibido();
		}
		
		return sumador;
	}

	public Double getMontoImponible() {
		Double sumador = 0d;

		for (IngresoAbstracto ingreso : this.getIngresosPercibidosDelAño()) {
			sumador += ingreso.getMontoImponible();
		}
		return sumador;
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2d;
	}

}
