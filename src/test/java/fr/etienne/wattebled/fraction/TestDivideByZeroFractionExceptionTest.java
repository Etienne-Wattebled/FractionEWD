package fr.etienne.wattebled.fraction;

import org.junit.Test;

import fr.etienne.wattebled.fraction.exception.DivideByZeroFractionException;

public class TestDivideByZeroFractionExceptionTest {
	@Test(expected=DivideByZeroFractionException.class)
	public void testNewInstance() {
		new Fraction(10,0);
	}
	
	@Test(expected=DivideByZeroFractionException.class)
	public void testLong() {
		new Fraction(19,30).divide(0);
	}
	
	@Test(expected=DivideByZeroFractionException.class)
	public void testString() {
		new Fraction("4/0");
	}
	
	@Test(expected=DivideByZeroFractionException.class)
	public void testSetDenominator() {
		new Fraction().setDenominator(0);
	}
	
	@Test(expected=DivideByZeroFractionException.class)
	public void testSetValues() {
		new Fraction().setValues(10,0);
	}
	
	@Test(expected=DivideByZeroFractionException.class)
	public void testFractionDivideFraction() {
		new Fraction(43,2).divide(new Fraction(0,3));
	}
}
