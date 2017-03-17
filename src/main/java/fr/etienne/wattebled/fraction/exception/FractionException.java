package fr.etienne.wattebled.fraction.exception;

public abstract class FractionException extends RuntimeException {
	protected FractionException(String error) {
		super(error);
	}
}
