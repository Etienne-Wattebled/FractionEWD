package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowTest {
	
	@Test
	public void testPow1() {
		Fraction f = new Fraction(2,3);
		f = f.pow(2);
		assertEquals(4,f.getNominator());
		assertEquals(9,f.getDenominator());
	}
	
	@Test
	public void testPow2() {
		Fraction f = new Fraction(6,8);
		f = f.pow(3);
		assertEquals(216,f.getNominator());
		assertEquals(512,f.getDenominator());
	}
	
	@Test
	public void testPow3() {
		Fraction f = new Fraction(2,5);
		f = f.pow(-2);
		assertEquals(25,f.getNominator());
		assertEquals(4,f.getDenominator());
	}
	
	@Test
	public void testPowNominator1() {
		Fraction f = new Fraction(2,3);
		f = f.powNominator(2);
		assertEquals(4,f.getNominator());
		assertEquals(3,f.getDenominator());
	}
	
	@Test
	public void testPowNominator2() {
		Fraction f = new Fraction(3,4);
		f = f.powNominator(-2);
		assertEquals(1,f.getNominator());
		assertEquals(36,f.getDenominator());
	}
	
	@Test
	public void testPowDenominator1() {
		Fraction f = new Fraction(7,8);
		f = f.powDenominator(3);
		assertEquals(7,f.getNominator());
		assertEquals(512,f.getDenominator());
	}
	
	@Test
	public void testPowDenominator2() {
		Fraction f = new Fraction(4,3);
		f = f.powDenominator(-2);
		assertEquals(36,f.getNominator());
		assertEquals(1,f.getDenominator());
	}
}
