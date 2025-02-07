package Wipro.com.Java8;

import java.util.Scanner;
import java.util.function.Function;

public class Test3 {
	
	public static void main(String [] args) {
		Function<String, Integer> function = 
				
				x -> x.length();
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String name = sc.nextLine();
		System.out.println("Length of String:"+ " "+ function.apply(name));
	}

}
