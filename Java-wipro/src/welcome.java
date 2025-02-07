
public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		package com.wipro.cfw;
		 
		import java.util.SortedSet;

		import java.util.TreeSet;
		 
		public class Test5 {
		 
			public static void main(String[] args) {

				SortedSet s = new TreeSet();

				s.add(100);

				/*

				 * s.add("rk"); s.add(5.6); s.add(false);

				 */

				s.add(6);

				s.add(67);

				s.add(-5);

				s.add(234);

				s.add(333);

				s.add(152);


				/*

				 * System.out.println(s.first()); System.out.println(s.last());

				 * System.out.println(s.headSet(234)); System.out.println(s.tailSet(152));

				 * System.out.println(s.subSet(67, 234));

				 */

				System.out.println(s);

			}

		}

		 
		package com.wipro.cfw;
		 
		import java.util.TreeSet;
		 
		 
		public class Test6 {
		 
			
			public static void main(String[] args) {
				
				TreeSet<Student> hs = new TreeSet<>();
				
				hs.add(new Student(100,"rk"));
				hs.add(new Student(101,"shaik"));
				hs.add(new Student(45,"ashish"));
				hs.add(new Student(234,"pratyush"));
				hs.add(new Student(56,"kumar"));
				
				System.out.println(hs);
			}
		}
		 
		 
		package com.wipro.cfw;
		 
		public class Student implements Comparable<Student> {
			
			private Integer stid;
			private String stname;
			public Integer getStid() {
				return stid;
			}
			public void setStid(Integer stid) {
				this.stid = stid;
			}
			public String getStname() {
				return stname;
			}
			public void setStname(String stname) {
				this.stname = stname;
			}
			public Student(Integer stid, String stname) {
				super();
				this.stid = stid;
				this.stname = stname;
			}
			
			public Student()
			{
				
			}
			
			@Override
			public String toString()
			{
				return stid +  " " + stname;
			}
			@Override
			public int compareTo(Student o) {
				
				/*
				 * if(this.getStid()>o.getStid()) { return -4; } else if(this.getStid() <
				 * o.getStid()) { return +7; } else { return 0; }
				 */
				
				//return o.getStid().compareTo(this.getStid());
			
			     return -this.getStname().compareTo(o.getStname());
			}
		 
		}
		 
		 
		Sir, Can you explain the compareTo part again? I'm not getting to this point.
		 
		yes sir
		 
		i can understand some concept sir let's see sir i'll ask if i have any doubt 
		 
		package com.wipro.cfw;
		 
		import java.util.Comparator;
		 
		public class StudentIDComparator implements Comparator<Student> {
		 
			@Override
			public int compare(Student o1, Student o2) {
				
				return o2.getStid().compareTo(o1.getStid());
				
			}
		 
		}
		 
		 
		package com.wipro.cfw;
		 
		import java.util.Comparator;
		 
		public class StudentNameComparator implements Comparator<Student> {
		 
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getStname().compareTo(o1.getStname());
			}
		 
		}
		 
		 
		package com.wipro.cfw;
		 
		import java.util.TreeSet;
		 
		 
		public class Test6 {
		 
			
			public static void main(String[] args) {
				
				TreeSet<Student> hs = new TreeSet<>(new StudentNameComparator());
				
				hs.add(new Student(100,"rk"));
				hs.add(new Student(101,"shaik"));
				hs.add(new Student(45,"ashish"));
				hs.add(new Student(234,"pratyush"));
				hs.add(new Student(56,"kumar"));
				
				System.out.println(hs);
			}
		}
		 
		 

	}

}
