package edu.unlam.paradigmas.excepciones.ej03;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTests {

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	

	@Test(expected = DivisionPorCeroException.class)
	public void divisionPorCero() throws DivisionPorCeroException {
		Main.cociente(5,0);
	}
	
	@Test
	public void divisionCorrecta() throws DivisionPorCeroException {
		Assert.assertEquals(Main.cociente(10,5),2.0,0.01);
		
	}

}
