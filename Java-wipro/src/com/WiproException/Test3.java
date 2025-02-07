package com.WiproException;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 obj = new Test2();
		try {
			obj.division();
		}
		catch(ArithmeticException ae) {
			System.out.println("Something went wrong");
		}

		

	}

}
