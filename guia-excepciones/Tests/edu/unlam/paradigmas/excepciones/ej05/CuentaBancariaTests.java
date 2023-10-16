package edu.unlam.paradigmas.excepciones.ej05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CuentaBancariaTests {

	//@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void crearCuentaSaldoNegativo() throws CrearCuentaSaldoNegativoException {
		CuentaBancaria cuenta = new CuentaBancaria(-100);
		Assert.assertEquals(cuenta.consultarSaldo(),0.0,0.01);
	}
	
	@Test
	void crearCuentaSaldoCorrecto() throws CrearCuentaSaldoNegativoException {
		CuentaBancaria cuenta = new CuentaBancaria(100);
		Assert.assertEquals(cuenta.consultarSaldo(),100.0,0.01);
	}
	
	@Test
	void depositarSaldoNegativo() throws CrearCuentaSaldoNegativoException, TransaccionSaldoNegativoException{
		CuentaBancaria cuenta = new CuentaBancaria(100);
		cuenta.depositar(-1);
		Assert.assertEquals(cuenta.consultarSaldo(),100.0,0.01);
	}
	
	@Test
	void depositarSaldoCorrecto() throws CrearCuentaSaldoNegativoException, TransaccionSaldoNegativoException{
		CuentaBancaria cuenta = new CuentaBancaria(100);
		cuenta.depositar(100);
		Assert.assertEquals(cuenta.consultarSaldo(),200.0,0.01);
	}
	
	@Test
	void retirarSaldoNegativo() throws CrearCuentaSaldoNegativoException, SaldoInsuficienteException, TransaccionSaldoNegativoException {
		CuentaBancaria cuenta = new CuentaBancaria(100);
		cuenta.retirar(-10);
		Assert.assertEquals(cuenta.consultarSaldo(),100.0,0.01);
	}
	
	@Test
	void retirarSaldoInsuficiente() throws CrearCuentaSaldoNegativoException, SaldoInsuficienteException, TransaccionSaldoNegativoException {
		CuentaBancaria cuenta = new CuentaBancaria(100);
		cuenta.retirar(1000);
		Assert.assertEquals(cuenta.consultarSaldo(),100.0,0.01);
	}
	
	@Test
	void retirarSaldoCorrecto() throws CrearCuentaSaldoNegativoException, SaldoInsuficienteException, TransaccionSaldoNegativoException {
		CuentaBancaria cuenta = new CuentaBancaria(100);
		cuenta.retirar(10);
		Assert.assertEquals(cuenta.consultarSaldo(),90.0,0.01);
	}
	
	
	
}
