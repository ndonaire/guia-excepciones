package edu.unlam.paradigmas.excepciones.ej04;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CuentaBancariaTests {

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test(expected = SaldoInsuficienteException.class)
	public void retirarSaldoInsuficiente() throws SaldoInsuficienteException {
		CuentaBancaria cuenta = new CuentaBancaria(1000);
		cuenta.retirar(90000);
	}
	
	@Test
	public void retirarSaldoCorrecto() throws SaldoInsuficienteException {
		CuentaBancaria cuenta = new CuentaBancaria(1000);
		cuenta.retirar(900);
		Assert.assertEquals(cuenta.consultarSaldo(), 100.0, 0.01);
	}
}
