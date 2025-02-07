package Wipro.com.Java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = x -> x%2==0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
	
		if(p.test(number)) {
			System.out.println(number + "is even");
		}else {
			System.out.println(number + "is odd");
		}
		

	}

}
