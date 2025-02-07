package Wipro.com.PAckage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class Testr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Set k = new LinkedHashSet();
		for(int i = 1; i<=10;i++) {
			k.add(i);
		}
		for(Object o:k) {
			Integer i = (Integer)o;
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		Iterator itr = k.iterator();
		while(itr.hasNext()) {
			
			Integer i = (Integer)itr.next();
			if(i%2!=0) {
				itr.remove();
			}
			
		}
		System.out.println(k);

	}

}
