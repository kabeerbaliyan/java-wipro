package Wipro.com.Java8;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> s = new TreeSet<>((x,y) -> y.compareTo(x));
		for(int i =1;i<=10;i++) {
			s.add(i);
			
		}
		System.out.println(s);

	}

}
