package com.wipro.codingQuestions;

import java.util.Scanner;

public class LargestElementArray {
	
	public static int largest(int arr[]) {
		
		int max = arr[0];
		for(int num : arr) {
			if(num>max) {
				max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No. Of Element: ");
		int n = sc.nextInt();
		System.out.println("Enter The Elements: ");
		int [] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("Largest Element: " + largest(arr));
		
		

	}

}
