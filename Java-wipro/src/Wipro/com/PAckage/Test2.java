package Wipro.com.PAckage;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String [] args) {
		List l = new ArrayList();
		l.add(100);
		l.add(false);
		l.add(null);
		
		for(Object o:l) {
			System.out.println(o);
			System.out.println();
		}
		
	}

}
