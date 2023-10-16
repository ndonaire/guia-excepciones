package edu.unlam.paradigmas.excepciones.ej04;

public class CuentaBancaria {
	double saldo;

	public CuentaBancaria(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(double monto){
		if(monto > 0)
			this.saldo += monto;
	}
	
	public void retirar(double monto) throws SaldoInsuficienteException{
		if(monto > this.saldo)
				throw new SaldoInsuficienteException("Saldo insuficiente para realizar esta transacción");
			this.saldo-=monto;				
		}
}
