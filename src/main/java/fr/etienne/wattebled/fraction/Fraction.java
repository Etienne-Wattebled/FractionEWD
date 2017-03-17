package fr.etienne.wattebled.fraction;

import fr.etienne.wattebled.fraction.exception.DivideByZeroFractionException;
import fr.etienne.wattebled.fraction.exception.FractionException;
import fr.etienne.wattebled.fraction.exception.ParseFractionException;
import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Étienne Wattebled 
 * etienne.wattebled@gmail.com
 */
public class Fraction {
	
	private long nominator;
	private long denominator;
	
	/**
	 * Create a new fraction equals to 0/1
	 */
	public Fraction() {
		setNominator(0);
		setDenominator(1);
	}
	
	/**
	 * Create a new Fraction with the value s
	 * s can be :
	 * - A number like 10
	 * - A fraction with the '/' separator like 10/4
	 * @throws DivideByZeroFractionException and ParseFractionException
	 * @param String s which represents the Fraction
	 */
	public Fraction(String s) {
		setValue(s);
	}
	/**
	 * Clone the fraction f
	 * @param f the fraction to copy
	 */
	public Fraction(Fraction f) {
		setNominator(f.getNominator());
		setDenominator(f.getDenominator());
	}
	/**
	 * Create a new Fraction equals to n/d
	 * @param n nominator
	 * @param d denominator
	 * @throws DivideByZeroFractionException
	 */
	public Fraction(long n, long d) {
		setNominator(n);
		setDenominator(d);
	}
	/**
	 * Create a new Fraction equals to n/1
	 * @param n nominator
	 */
	public Fraction(long n) {
		setNominator(n);
		setDenominator(1);
	}
	/**
	 * 
	 * @return the double value (approximation)
	 */
	public double toDoubleValue() {
		return nominator/denominator;
	}
	/**
	 * 
	 * @return the float value (approximation)
	 */
	public float toFloatValue() {
		return nominator/denominator;
	}
	
	public long round() {
		double x = nominator/denominator;
		return Math.round(x);
	}
	
	public long getNominator() {
		return nominator;
	}
	
	public long getDenominator() {
		return denominator;
	}
	
	public void setNominator(long n) {
		nominator = n;
	}
	
	public void setDenominator(long d) {
		if (d == 0) {
			throw new DivideByZeroFractionException();
		}
		denominator = d;
	}
	
	/**
	 * 
	 * @return true if nominator/denominator > 0
	 */
	public boolean isPositive() {
		return ((((nominator>=0)&& (denominator >=0))) || ((nominator<0)&& (denominator<0)));
	}
	/**
	 * 
	 * @return true if nominator/denominator < 0
	 */
	public boolean isNegative() {
		return !isPositive();
	}
	
	/**
	 * 
	 * @param s String which represents the fraction.
	 * s can be
	 * - A number like 30
	 * - A fraction with '/' separator like 10/43
	 * Values (numerator and denominator) should be long
	 * @throws ParseFractionException and DivideByZeroException
	 */
	public void setValue(String s) {
		try {
			if (StringUtils.isEmpty(s)) {
				setNominator(0);
				setDenominator(1);
				return;
			}
			String tab[] = s.split("/");
			if (tab.length > 2) {
				throw new ParseFractionException("The fraction couldn't contain more than two '/' separators.");
			}
			setNominator(Integer.parseInt(tab[0]));
			
			if (tab.length == 1) {
				setDenominator(1);
			} else  {
				setDenominator(Integer.parseInt(tab[1]));
			}
		} catch (NumberFormatException nfe) {
			throw new ParseFractionException("All values should be numeric (and only one slash is allowed).");
		}
	}
	
	private static long gcd(long a,long b) {
		long r;
		r = a%b;
		while (r != 0) {
			a = b;
			b = r;
			r = a%b;
		}
		return b;
	}
	
	private static long lcm(long a, long b) {
		return (a*b)/(gcd(a,b));
	}
	
	public Fraction add(Fraction f) {
		long lcm = lcm(getDenominator(),f.getDenominator());
		return new Fraction(getNominator()*(lcm/getDenominator())+f.getNominator()*(lcm/f.getDenominator()),lcm);
	}
	
	public Fraction add(long a) {
		Fraction f = new Fraction(this);
		f.setNominator(getNominator() + a*getDenominator());
		return f;
	}
	
	public Fraction substract(Fraction f) {
		long lcm = lcm(getDenominator(),f.getDenominator());
		return new Fraction(getNominator()*(lcm/getDenominator())-f.getNominator()*(lcm/f.getDenominator()),lcm);
	}
	
	public Fraction substract(long a) {
		Fraction f = new Fraction(this);
		f.setNominator(getNominator() - a*getDenominator());
		return f;
	}
	
	public Fraction multiply(Fraction f1) {
		return new Fraction(getNominator()*f1.getNominator(),getDenominator()*f1.getDenominator());
	}
	
	public Fraction multiply(long a) {
		return new Fraction(getNominator()*a,getDenominator()*a);
	}
	
	public Fraction divide(long a) {
		return new Fraction(getNominator(),getDenominator()*a);
	}
	
	public Fraction divide(Fraction f) {
		return new Fraction(getNominator()*f.getDenominator(),getDenominator()*f.getNominator());
	}
	/**
	 * Set the fraction to n/1
	 * @param n nominator
	 */
	public void setValue(long n) {
		setNominator(n);
		setDenominator(1);
	}
	/**
	 * Set the fraction to n/d
	 * @param n
	 * @param d
	 * @throws DivideByZeroFractionException
	 */
	public void setValues(long n, long d) {
		setNominator(n);
		setDenominator(d);
	} 
	
	public String toString() {
		return nominator+"/"+denominator;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
	/**
	 * Simplify the current fraction
	 */
	public void simplify() {
		long gcd = gcd(getNominator(),getDenominator());
		setNominator(getNominator()/gcd);
		setDenominator(getDenominator()/gcd);
		simplifySymbol();
	}
	
	public void simplifySymbol() {
		if ((getNominator() < 0) && (getDenominator() < 0)) {
			setNominator(-nominator);
			setDenominator(-denominator);
		}
		else if (getDenominator() < 0) {
			setDenominator(-denominator);
			setNominator(-nominator);
		}
	}
	
	public long compareTo(Fraction f) {
		if (getDenominator() == f.getDenominator()) {
			return (getNominator()==f.getNominator())?0:(getNominator() > f.getNominator())?1:-1;
		} else {
			long f1=getNominator()*f.getDenominator();
			long f2=f.getNominator()*getDenominator();
			return (f1==f2)?0:(f1>f2)?1:-1;
		}
	}
	
	public boolean equals(Fraction f) {
		return (compareTo(f)==0)?true:false;
	}
	
	public boolean before(Fraction f) {
		return (compareTo(f)==-1)?true:false;
	}
	
	public boolean after(Fraction f) {
		return (compareTo(f)==1)?true:false;
	}
	
	public boolean beforeOrEquals(Fraction f) {
		long a = compareTo(f);
		return (a==0)?true:(a==-1)?true:false;
	}
	
	public boolean afterOrEquals(Fraction f) {
		long a = compareTo(f);
		return (a==0)?true:(a==1)?true:false;
	}
	/**
	 * Inverse the symbol
	 * nominator = -nominator
	 */
	public void inverseSymbol() {
		setNominator(-nominator);
	}
	
	/**
	 * Inverse the fraction
	 * denominator/nominator
	 * @throws DivideByZeroFractionException
	 */
	public void inverse() {
		long prov=getNominator();
		setNominator(getDenominator());
		setDenominator(prov);
	}
	
	public Fraction pow(long p) {
		Fraction f = new Fraction(this);
		if (p<0) {
			long b = f.getNominator();
			f.setNominator(f.getDenominator());
			f.setDenominator(b);
			p = -p;
		}
		f.setNominator((long)Math.pow(getNominator(),p));
		f.setDenominator((long)Math.pow(getDenominator(),p));
		return f;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (denominator ^ (denominator >>> 32));
		result = prime * result + (int) (nominator ^ (nominator >>> 32));
		return result;
	}
}
