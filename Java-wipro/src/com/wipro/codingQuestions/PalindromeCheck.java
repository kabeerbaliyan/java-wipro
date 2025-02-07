package com.wipro.codingQuestions;

import java.util.Scanner;

public class PalindromeCheck {
	

	public static boolean IsPalindrome(String str) {
	
	    String rev = new  StringBuilder(str).reverse().toString();
		return str.equals(rev);
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str = sc.nextLine();
		
		System.out.println("Is Palindrome: " + IsPalindrome(str));
		
		
		
		
		

	}

}
