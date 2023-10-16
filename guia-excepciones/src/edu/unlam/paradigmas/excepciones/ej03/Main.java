package edu.unlam.paradigmas.excepciones.ej03;

public class Main {

	public static void main(String[] args) {
		System.out.println(cociente(5,0));

	}
	
	public static double cociente(int a, int b) throws DivisionPorCeroException {
		if(b == 0)
			throw new DivisionPorCeroException("Error: División por cero");
		return a/b;
	}

}
