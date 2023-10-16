package edu.unlam.paradigmas.excepciones.ej02;

public class Main {

	public static void main(String[] args) throws NegativeSqrtException {
		System.out.println(raizCuadrada(-1));
	}
	
	public static double raizCuadrada(int a) throws NegativeSqrtException {
		if(a < 0)
			throw new NegativeSqrtException("Error: Raíz cuadrada de número negativo");
		return Math.sqrt(a);
	}
}
