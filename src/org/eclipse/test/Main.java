package org.eclipse.test;

import java.util.Scanner;

import org.eclipse.exception.IncorrectCodePostalException;
import org.eclipse.exception.IncorrectRueException;
import org.eclipse.model.Adresse;

public class Main {

	public static void main(String[] args) {
//		int x = 7, y = 0;
//		try {
//			System.out.println(x / y);
//		} catch (ArithmeticException e) {
//			System.out.println("catch 1");
//		} catch (Exception e) {
//			System.out.println("catch 2");
//		}
//		
//		System.out.println("fin");
		
//		try {
//			Adresse adresse = new Adresse("paradis", "1300", "Marseille");
//		} catch (IncorrectCodePostalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("fin");
		Scanner scanner = new Scanner(System.in);
		try {
			Adresse adresse = new Adresse("PARADIS", "1300", "Marseille");
		} catch (IncorrectCodePostalException | IncorrectRueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("fin");

	}

}
