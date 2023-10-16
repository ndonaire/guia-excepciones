package edu.unlam.paradigmas.excepciones.ej01;

public class Main {

	public static void main(String[] args) {
		System.out.println(division(50,0));
		
	}
	
	public static double division(int a, int b) throws  ArithmeticException {
		if(b == 0)
			throw new ArithmeticException("Division por cero");
		return a/b;
	}
}
