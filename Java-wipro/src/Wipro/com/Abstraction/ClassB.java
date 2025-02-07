package Wipro.com.Abstraction;

public abstract  class ClassB{
	
	public static void main(String [] args) {
		ClassA obj = new SumOperation();
		obj.operation(4, 2);
		
		ClassA obj1 = new SubOperation();
		obj1.operation(4, 2);
		}
	}


