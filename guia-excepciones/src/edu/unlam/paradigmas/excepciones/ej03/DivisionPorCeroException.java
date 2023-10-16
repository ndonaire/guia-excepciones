package edu.unlam.paradigmas.excepciones.ej03;

public class DivisionPorCeroException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public DivisionPorCeroException(String string) {
        super(string);
    }
}
