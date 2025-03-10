package com.wipro.multithreading;

public class Test4  {
 
	
	public static void main(String[] args) {
		
		Runnable r = ()-> {
			for(int i=1;i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+ " " + i);
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
		
	}
}
