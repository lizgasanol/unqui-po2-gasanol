package ar.edu.unq.po2.tpRefactoring.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	protected boolean cumpleCondicion(Integer monto) {
		return this.saldo>=monto;
	}
	

}
