package com.WiproException;

import java.rmi.AccessException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
	 int x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the First no.");
			int n = scanner.nextInt();
			System.out.println("Enter second Number");
			
			int x = scanner.nextInt();
			double div = n/x;
			System.out.println(div);
		// x = 100/0;
		 }
		catch(ArithmeticException ae ) {
			System.out.println("Please don't enter zero");
		}
		catch(InputMismatchException ipm) {
			System.out.println("Please pass numeric value");
		}
		catch( RuntimeException re) {
			//if(re instancef ArithmeticException) {
			System.out.println("re");
		
			//else if(re instanf InputMismatchException) {
			//	System.out.println("please pass numeric value");
			//}
		}
			
		finally {
			System.out.println("Finally block , executed usually");
		}
		//catch(InputMismatchException ) {
			//System.out.println("please pass numeric value");
		//}
		
		//System.out.println("Division" + x);
		System.out.println("Excetionn Handling");
		System.out.println("Excetionn Handling");
		System.out.println("Excetionn Handling");
		System.out.println("Excetionn Handling");
		System.out.println("Excetionn Handling");

	}
	}

