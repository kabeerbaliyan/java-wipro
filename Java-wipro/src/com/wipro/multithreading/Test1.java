package com.wipro.multithreading;

public class Test1 {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		 Thread.getAllStackTraces().keySet().forEach(thread ->
         System.out.println(thread.getName() + " - " + thread.getState()));
 
	}
 
}
