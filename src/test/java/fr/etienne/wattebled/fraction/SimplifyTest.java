package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimplifyTest {
	@Test
	public void simplifySymbol1() {
		Fraction f = new Fraction(2,3);
		f.simplifySymbol();
		assertEquals(2,f.getNominator());
		assertEquals(3,f.getDenominator());
	}
	
	@Test
	public void simplifySymbol2() {
		Fraction f = new Fraction(2,-3);
		f.simplifySymbol();
		assertEquals(-2,f.getNominator());
		assertEquals(3,f.getDenominator());
	}
	
	
	@Test
	public void simplifySymbol3() {
		Fraction f = new Fraction(-2,-3);
		f.simplifySymbol();
		assertEquals(2,f.getNominator());
		assertEquals(3,f.getDenominator());
	}
	
	@Test
	public void simplify1() {
		Fraction f = new Fraction(2,6);
		f.simplify();
		assertEquals(1,f.getNominator());
		assertEquals(3,f.getDenominator());
	}
	
	@Test
	public void simplify2() {
		Fraction f = new Fraction(10,-100);
		f.simplify();
		assertEquals(-1,f.getNominator());
		assertEquals(10,f.getDenominator());
	}
}
