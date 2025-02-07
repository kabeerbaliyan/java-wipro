package Wipro.com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("bob","charlie","kabeer");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(x->System.out.println(x));
			
		List<Integer> numbers = Arrays.asList(10,15,20,25,30,35,40);
		numbers.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
		
		names.stream().map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		numbers.stream().sorted().forEach(x->System.out.println(x));
		//System.out.println("=========");
		//numbers.stream().sorted(x,y)->y.compareTo(x).forEach(x->System.out.println(x));
		System.out.println("==========");
		List<Integer> nmbr = Arrays.asList(10,20,20,30,30,30,40);
		nmbr.stream().distinct().forEach(x->System.out.println(x));
		nmbr.stream().limit(3).forEach(x->System.out.println(x));
		System.out.println("=========");
		nmbr.stream().skip(3).forEach(x->System.out.println(x));
		
		System.out.println("=========");
		int sum = nmbr.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum:"+ sum);
		
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("java","spring"),
				Arrays.asList("microservices","docker")
				);
		System.out.println("=========");
		System.out.println(nestedList.stream().flatMap(x->x.stream()).collect(Collectors.toList()));
		
	}

}
