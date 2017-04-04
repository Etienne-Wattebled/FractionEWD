Author: Étienne WATTEBLED - etienne.wattebled@gmail.com

This project permits to use fractions in Java like 2/10, 1/3, 3/2 and so on without any lost of precision.
You can use some operations like add, substract, multiply, divide, simplify...

You can easily create a fraction.

WARNING: CAN GENERATE 2 EXCEPTIONS
* FractionException : general exception
* DivideByZeroFractionException : with a division by zero
* ParseFractionException : if the parsing fails. Example: new Fraction("Hello World");

Constructors (creating fractions)
==
    // fraction 0/1
    new Fraction();
    
    // fraction 1/3
    new Fraction(1,3);
    
    // fraction 2/3
    new Fraction("2/3");
    
    // fraction 15/1
    new Fraction("15");
    new Fraction(15);

Set the value of the nominator and denominator
==
    Fraction f = new Fraction();
    
    // 15/1
    f.setValue(15);
   
    // 1/3
    f.setValues(1,3);
    
    // 15/1
    f.setValue("15");
    
    // 1/3
    f.setvalue("1/3");
    
    // Just change the nominator (only)
    f.setNominator(3);
    
    // Just change the denominator (only)
    f.setDenominator(2);
   
Simplificate
==
    Fraction f = new Fraction(2,6);
    
    // Now 1/3
    f.simplify();
    
    f = new Fraction(2,-6);
    
    // Now -1/3
    f.simplify();
    
    f = new Fraction(2,-6);
    
    // Now -2/6
    f.simplifySymbol();
    
Computing
==
    Fraction f1 = new Fraction(1,3);
    Fraction f2 = new Fraction(3,4);
    Fraction result = null;
   
    // f1 + f2
    result = f1.add(f2);
    
    // f1 - f2
    result = f1.substract(f2);
    
    // f1 * f2
    result = f1.multiply(f2);
    
    // f1 / f2
    result = f1.divide(f2);
    
    // With long, it is possible
    result = f1.multiply(12);
    
    // Pow
    result = f1.powNominator(3);
    result = f1.powDenominator(5);
    resut = f1.pow(10);
    
    // Inverse : now 1/(1/3) = (1/1)/(1/3) = (1/1)*(3/1) = 3/1 = 3
    f1.inverse();
    
    // Inverse symbol (- on nominator)
    f1.inverseSymbol();
  

    
