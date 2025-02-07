package Wipro.Trainingoops;

class employeee {
	int salary = 6000;
}

class engineer extends employeee{
	int benefits = 1000;
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		engineer e1 = new engineer();
		System.out.println("Salary:"+(e1.salary + e1.benefits));
		

	}

}
