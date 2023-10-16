package edu.unlam.paradigmas.excepciones.ej02;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RaizCuadradaTests {

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected = NegativeSqrtException.class)
	public void raizCuadradaNegativa() throws NegativeSqrtException {
		Main.raizCuadrada(-100);
	}
	
	@Test
	public void raizCuadradaCorrecta() throws NegativeSqrtException {
		Assert.assertEquals(Main.raizCuadrada(4),2.0,0.01);
		
	}
}
