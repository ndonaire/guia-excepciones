package edu.unlam.paradigmas.excepciones.ej05;

public class TransaccionSaldoNegativoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public TransaccionSaldoNegativoException(String msg) {
		super(msg);
	}
}
