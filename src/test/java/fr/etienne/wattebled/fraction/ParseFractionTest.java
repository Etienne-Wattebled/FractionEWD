package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParseFractionTest {
	@Test
	public void testNewInstance() {
		Fraction f = new Fraction("10");
		assertEquals(10,f.getNominator());
		assertEquals(1,f.getDenominator());
	}
	
	@Test
	public void testNewInstance2() {
		Fraction f = new Fraction("33/5");
		assertEquals(33,f.getNominator());
		assertEquals(5,f.getDenominator());
	}
	
	@Test
	public void testSetValue() {
		Fraction f = new Fraction();
		f.setValue("54");
		assertEquals(54,f.getNominator());
		assertEquals(1,f.getDenominator());
	}
	
	@Test
	public void testSetValueS() {
		Fraction f = new Fraction();
		f.setValue("3/6");
		assertEquals(3,f.getNominator());
		assertEquals(6,f.getDenominator());
	}
}
