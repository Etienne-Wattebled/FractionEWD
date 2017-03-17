package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubstractTest {
	@Test
	public void testSubstract1() {
		Fraction f1 = new Fraction(10,3);
		Fraction f2 = new Fraction(9,5);
		Fraction r  = f1.substract(f2);
		assertEquals(23,r.getNominator());
		assertEquals(15,r.getDenominator());
	}
	
	@Test
	public void testSubstract2() {
		Fraction f1 = new Fraction(-6,2);
		Fraction f2 = new Fraction(5,-4);
		Fraction r  = f1.substract(f2);
		assertEquals(7,r.getNominator());
		assertEquals(-4,r.getDenominator());
	}
	
	@Test
	public void testSubstract3() {
		Fraction f1 = new Fraction(5,5);
		Fraction f2 = new Fraction(2,5);
		Fraction r  = f1.substract(f2);
		assertEquals(3,r.getNominator());
		assertEquals(5,r.getDenominator());
	}
}
