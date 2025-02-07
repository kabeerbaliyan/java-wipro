package Wipro.Trainingoops;

class Employee{
	private int empid;
	private String ename;
	
	public int get_id() {
		return empid;
	}
	public String get_name() {
		return ename;
	}
	
	public void set_id(int id) {
		this.empid = id;
	}
	public void set_name(String name) {
		this.ename = name;
	}
}


public class Encapsulation {
	
	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.set_id(25);
		E1.set_name("Kabeer");
		System.out.println(E1.get_id() + " "+ E1.get_name());
	}

}
