package Wipro.com.PAckage;


public class Test1 {
	public static void main(String []  args) {
		int x[];
		x = new int[3];
		x[0]= 10;
		x[1]=20;
		x[2]=30;
		
		for(int i=0;i<3;i++) {
			System.out.println(x[i]);
		}
		// for each loop
		int index =0;
		for(int y:x) {
			System.out.println("Index"+ index+ ",Value:"+y);
			index++;
			
		}
	}

}
