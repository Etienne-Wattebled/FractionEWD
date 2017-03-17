package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideTest {
	@Test
	public void testDivide1() {
		Fraction f1 = new Fraction(2,4);
		Fraction f2 = new Fraction(1,2);
		Fraction r = f1.divide(f2);
		assertEquals(4,r.getNominator());
		assertEquals(4,r.getDenominator());
	}
	
	@Test
	public void testDivide2() {
		Fraction f1 = new Fraction(6,4);
		Fraction f2 = new Fraction(9,2);
		Fraction r = f1.divide(f2);
		assertEquals(12,r.getNominator());
		assertEquals(36,r.getDenominator());
	}
	
	@Test
	public void testDivide3() {
		Fraction f1 = new Fraction(2,-5);
		Fraction f2 = new Fraction(3,9);
		Fraction r = f1.divide(f2);
		assertEquals(18,r.getNominator());
		assertEquals(-15,r.getDenominator());
	}
	
	@Test
	public void testDivide4() {
		Fraction f = new Fraction(3,5);
		Fraction r = f.divide(-3);
		assertEquals(3,r.getNominator());
		assertEquals(-15,r.getDenominator());
	}
}
