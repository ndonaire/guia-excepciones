package edu.unlam.paradigmas.excepciones.ej08;


public class Main {

	public static void main(String[] args) {
		System.out.println(division(50,0));
		
	}
	
	public static double division(int a, int b) { //activar assert desde las preferences de Eclipse
		assert b!= 0: "División por cero";
		return a/b;
	}
	
}
