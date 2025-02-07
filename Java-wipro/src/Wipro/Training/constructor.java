package Wipro.Training;

public class constructor {
	
	int id;
	String name;
	int RollNo ;
	
	constructor(){
		
		
	}
	
	constructor(int x,String y, int z){
		id = x;
		name =y;
		RollNo=z;
		
	}	
	
	
	void display() {
		System.out.println(id+" "+name+" "+RollNo);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor obj = new constructor();
		constructor obj1 = new constructor(1,"KABEER",2000680155);
		constructor obj2 = new constructor(2,"RAJ",200068192);
		constructor obj3 = new constructor(3,"Ujjwal", 23456765);
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		
		

	}

}
