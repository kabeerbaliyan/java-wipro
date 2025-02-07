package com.WiproException;

import java.util.Scanner;

public class Test4 {
	public void checkProduct (int weight) {
		if(weight>100) {
			System.out.println("Valid");
		}
		else {
			try {
			throw new InvalidProductException();
		}
			catch(InvalidProductException ipe) {
				System.out.println("Product must be greater than 100 kg");
			}
	}

}
	public static void main(String [] args) {
		Test4 obj = new Test4();
		System.out.println("Enter the Weight:");
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		
		obj.checkProduct(weight);
		
	}
}
