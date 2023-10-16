package edu.unlam.paradigmas.excepciones.ej01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTests {

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisionPorCero() {
		Main.division(5,0);
	}
	
	@Test
	public void divisionCorrecta() {
		Assert.assertEquals(Main.division(10,5),2.0,0.01);
		
	}
}
