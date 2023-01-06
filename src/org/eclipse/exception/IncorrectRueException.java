package org.eclipse.exception;

public class IncorrectRueException extends Exception {
	public IncorrectRueException(String value) {
		System.out.println("Le nom de la rue " +  value +  " doit être en majuscule");
	}
	
}
