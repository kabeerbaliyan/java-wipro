package Wipro.com.Java8;

import java.util.Scanner;
import java.util.function.Consumer;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> consumer = x -> System.out.println("Mr. "+x);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String candidateName = sc.nextLine();
		consumer.accept(candidateName);
	}

}
