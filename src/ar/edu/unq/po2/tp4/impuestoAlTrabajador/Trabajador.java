package ar.edu.unq.po2.tp4.impuestoAlTrabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<IngresoAbstracto> ingresosPercibidosDelA�o = new ArrayList<IngresoAbstracto>();
	
	public void agregrarIngreso(IngresoAbstracto unIngreso) {
		this.getIngresosPercibidosDelA�o().add(unIngreso);
	}

	public List<IngresoAbstracto> getIngresosPercibidosDelA�o() {
		return this.ingresosPercibidosDelA�o;
	}

	public Double getTotalPercibido() {
		Double sumador = 0d;
		
		for (IngresoAbstracto ingreso : this.getIngresosPercibidosDelA�o()) {
			sumador += ingreso.getMontoPercibido();
		}
		
		return sumador;
	}

	public Double getMontoImponible() {
		Double sumador = 0d;

		for (IngresoAbstracto ingreso : this.getIngresosPercibidosDelA�o()) {
			sumador += ingreso.getMontoImponible();
		}
		return sumador;
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2d;
	}

}
