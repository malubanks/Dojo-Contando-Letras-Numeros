package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContandoAsLetrasDosNumerosTest {

	@Test
	public void testConverteNumero1EmLetra () {
		String valor = ContandoAsLetrasDosNumeros.converteEmLetra(1);
		assertEquals("um", valor);
	}
}