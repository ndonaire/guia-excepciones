package edu.unlam.paradigmas.excepciones.ej05;

public class CuentaBancaria {
	double saldo;

	public CuentaBancaria(double saldo) throws CrearCuentaSaldoNegativoException {
		try{
			if(saldo < 0)
				throw new CrearCuentaSaldoNegativoException("Saldo negativo");
			this.saldo = saldo;
		}catch(CrearCuentaSaldoNegativoException e) {
			System.out.println("No se puede crear una cuenta con saldo negativo");
		}
	}

	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(double monto) throws TransaccionSaldoNegativoException{
		try{
			if(monto < 0)
				throw new TransaccionSaldoNegativoException("Saldo negativo");
			this.saldo += monto;
		}catch(TransaccionSaldoNegativoException e) {
			System.out.println("No se puede realizar una transacción con un monto negativo");
		}
			
	}
	
	public void retirar(double monto) throws SaldoInsuficienteException, TransaccionSaldoNegativoException{
		try{
			if(monto < 0)
				throw new TransaccionSaldoNegativoException("Saldo negativo");
			if(monto > this.saldo)
					throw new SaldoInsuficienteException("Saldo insuficiente");
				this.saldo-=monto;
		}catch(TransaccionSaldoNegativoException e) {
			System.out.println("No se puede realizar una transacción con un monto negativo");
		}
		catch(SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente para realizar esta transacción");
		}
	}
}