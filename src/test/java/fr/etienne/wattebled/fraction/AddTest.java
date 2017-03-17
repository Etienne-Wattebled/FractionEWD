package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTest {
	@Test
	public void testAdd1() {
		Fraction f1 = new Fraction(10,3);
		Fraction f2 = new Fraction(2,9);
		Fraction r  = f1.add(f2);
		assertEquals(32,r.getNominator());
		assertEquals(9,r.getDenominator());
	}
	
	@Test
	public void testAdd2() {
		Fraction f1 = new Fraction(5,4);
		Fraction f2 = new Fraction(12,6);
		Fraction r  = f1.add(f2);
		assertEquals(39,r.getNominator());
		assertEquals(12,r.getDenominator());
	}
	
	@Test
	public void testAdd3() {
		Fraction f1 = new Fraction(-1,2);
		Fraction f2 = new Fraction(11,-3);
		Fraction r  = f1.add(f2);
		assertEquals(-25,r.getNominator());
		assertEquals(6,r.getDenominator());
	}
}
