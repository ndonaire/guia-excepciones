package edu.unlam.paradigmas.excepciones.ej05;

public class CrearCuentaSaldoNegativoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CrearCuentaSaldoNegativoException(String msg) {
		super(msg);
	}
	
}
