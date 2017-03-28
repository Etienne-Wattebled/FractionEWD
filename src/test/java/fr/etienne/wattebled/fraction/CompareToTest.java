package fr.etienne.wattebled.fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CompareToTest {
	@Test
	public void testCompareTo1() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,5);
		assertEquals(1,f1.compareTo(f2));
	}
	
	@Test
	public void testCompareTo2() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,5);
		assertEquals(-1,f2.compareTo(f1));
	}
	
	@Test
	public void testCompareTo3() {
		Fraction f1 = new Fraction(1,5);
		Fraction f2 = new Fraction(1,5);
		assertEquals(0,f2.compareTo(f1));
	}
	
	@Test
	public void testBefore() {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,5);
		assertFalse(f1.before(f2));
		assertTrue(f2.before(f1));
	}
	
	@Test
	public void testAfter() {
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(2,3);
		assertTrue(f1.after(f2));
		assertFalse(f2.after(f1));
	}
	
	@Test
	public void testEquals() {
		Fraction f1 = new Fraction(2,5);
		Fraction f2 = new Fraction(4,10);
		Fraction f3 = new Fraction(2,5);
		Fraction f4 = new Fraction(3,2);
		assertTrue(f1.equals(f2));
		assertTrue(f2.equals(f3));
		assertTrue(f1.equals(f3));
		assertFalse(f1.equals(f4));
		assertFalse(f2.equals(f4));
		assertFalse(f3.equals(f4));
	}
}
