package fr.etienne.wattebled.fraction.exception;

public class DivideByZeroFractionException extends FractionException {
	public DivideByZeroFractionException() {
		super("The denominator cannot be equals to 0 because it creates a division by 0.");
	}
}
