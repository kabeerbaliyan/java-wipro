package com.wipro.codingQuestions;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		for(int i = 0 ;i<n;i++) {
			System.out.print(  a + " ");
			int next = a+b;
			a = b;
			b = next;
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();
		System.out.print("Fibonacci Series : ");
		fibonacci(n);

	}

}
