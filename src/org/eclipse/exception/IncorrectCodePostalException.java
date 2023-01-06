package org.eclipse.exception;

public class IncorrectCodePostalException extends Exception {
	public IncorrectCodePostalException(String value) {
		System.out.println("Le code postal " +  value + " va doit contenir exactement 5 caractères");
	}
	
	
	
}
