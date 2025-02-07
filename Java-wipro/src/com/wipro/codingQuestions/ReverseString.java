package com.wipro.codingQuestions;

import java.util.Scanner;

public class ReverseString {
	
	
	public static String reverse(String rev) {
		return new StringBuilder(rev).reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String kb = sc.nextLine();
		System.out.println("Reverse String : " + reverse(kb));
		
		
		

	}

}
