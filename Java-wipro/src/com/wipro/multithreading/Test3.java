package com.wipro.multithreading;

public class Test3 extends Thread{
	 
	@Override
    public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//creating a thread
		Test3 obj = new Test3();
		//System.out.println(obj.getName());
		
		obj.start();
		Test3 obj1 = new Test3();
		//System.out.println(obj1.getName());
		
		obj1.start();
		for(int i = 1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
