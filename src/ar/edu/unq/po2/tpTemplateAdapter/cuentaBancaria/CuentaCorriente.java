package ar.edu.unq.po2.tpTemplateAdapter.cuentaBancaria;

public class CuentaCorriente extends CuentaBancaria{
	private int descubierto;
	
	public CuentaCorriente (String titular, int descubierto) {
		super(titular);
		this.descubierto=descubierto;
	}
	
	public int getDescubierto() {
		return this.descubierto;
	}

	@Override
	protected Boolean validar(int monto) {
		return this.getSaldo()+this.getDescubierto()>=monto;
	}
}
