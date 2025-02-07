package Wipro.com.Java8;

import java.util.TreeSet;

import Wipro.com.PAckage.Student;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<>((x,y)->x.getstname().compareTo(y.getstname()));
		ts.add(new Student ());
		ts.add(new Student());
		System.out.println(ts);
	}

}
