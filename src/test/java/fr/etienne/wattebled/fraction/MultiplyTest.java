package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyTest {
	@Test
	public void testMultiply1() {
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(8,2);
		Fraction r = f1.multiply(f2);
		assertEquals(24,r.getNominator());
		assertEquals(8,r.getDenominator());
	}
	
	@Test
	public void testMultiply2() {
		Fraction f1 = new Fraction(-4,3);
		Fraction f2 = new Fraction(3,-3);
		Fraction r = f1.multiply(f2);
		assertEquals(-12,r.getNominator());
		assertEquals(-9,r.getDenominator());
	}
	
	@Test
	public void testMultiply3() {
		Fraction f1 = new Fraction(2,5);
		Fraction f2 = new Fraction(3,5);
		Fraction r = f1.multiply(f2);
		assertEquals(6,r.getNominator());
		assertEquals(25,r.getDenominator());
	}
	
	@Test
	public void testMultiply4() {
		Fraction f = new Fraction(6,4);
		Fraction r = f.multiply(3);
		assertEquals(18,r.getNominator());
		assertEquals(4,f.getDenominator());
	}
}
