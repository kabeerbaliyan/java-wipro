package com.wipro.codingQuestions;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		int res = 1;
		for(int i =2;i<=n;i++) {
			res *= i;
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " is: " + factorial(n));
		
		
		

	}

}
