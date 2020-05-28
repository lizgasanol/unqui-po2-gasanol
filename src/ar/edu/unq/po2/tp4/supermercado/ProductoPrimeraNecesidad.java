package ar.edu.unq.po2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Mercaderia {
	
	Double porcentajeDeDescuento;

	public ProductoPrimeraNecesidad(String nombre, Double precioBase, Boolean esParteDePreciosCuidados, Double porcentaje) {
		super(nombre, precioBase, esParteDePreciosCuidados);
		this.setPorcentajeDeDescuento(porcentaje);
	}

	private Double getPorcentajeDeDescuento() {
		return this.porcentajeDeDescuento;
	}
	
	private void setPorcentajeDeDescuento(Double porcentaje) {
		this.porcentajeDeDescuento = porcentaje;
	}
	
	@Override
	public Double getPrecio() {
		return this.getPrecioBase() - (this.getPrecioBase() * this.getPorcentajeDeDescuento() / 100);
	}

}
