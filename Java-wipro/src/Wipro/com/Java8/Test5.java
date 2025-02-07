package Wipro.com.Java8;

import java.util.Scanner;
import java.util.function.Supplier;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = sc.nextLine();
		
		Supplier<Integer> supplier = () -> inputString.length();
		System.out.println("Length of string:" + supplier.get());
	}

}
