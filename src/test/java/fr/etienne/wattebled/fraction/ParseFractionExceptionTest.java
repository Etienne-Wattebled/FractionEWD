package fr.etienne.wattebled.fraction;

import org.junit.Test;

import fr.etienne.wattebled.fraction.exception.ParseFractionException;

public class ParseFractionExceptionTest {
	@Test(expected=ParseFractionException.class)
	public void testCharacters() {
		new Fraction("Hello");
	}
	
	@Test(expected=ParseFractionException.class)
	public void testDoubleNominator() {
		new Fraction("12.4/23");
	}
	
	@Test(expected=ParseFractionException.class)
	public void testDoubleDenominator() {
		new Fraction("12/23.2");
	}	
}
