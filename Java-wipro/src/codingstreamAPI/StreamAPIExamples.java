package codingstreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;
    int age;
    
    public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }
    
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + ", salary=" + salary + "}";
    }
}

public class StreamAPIExamples {
    public static void main(String[] args) {
        // 1. Find Even Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Convert List of Strings to Uppercase
        List<String> names = Arrays.asList("rk", "john", "alex");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // 3. Find Names Starting with "A"
        List<String> namesStartingWithA = names.stream().filter(name -> name.startsWith("A") || name.startsWith("a")).collect(Collectors.toList());
        System.out.println("Names starting with A: " + namesStartingWithA);

        // 4. Square Each Number
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // 5. Sum of All Elements
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);

        // 6. Find Maximum & Minimum Value
        int max = numbers.stream().max(Integer::compareTo).orElseThrow();
        int min = numbers.stream().min(Integer::compareTo).orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);

        // 7. Sort a List of Strings
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        List<String> sortedNamesDesc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted Names Asc: " + sortedNames);
        System.out.println("Sorted Names Desc: " + sortedNamesDesc);

        // 8. Count Elements Matching a Condition
        long countGreaterThan10 = numbers.stream().filter(n -> n > 10).count();
        System.out.println("Count >10: " + countGreaterThan10);

        // 9. Find Duplicate Elements
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = numbers.stream().filter(n -> !unique.add(n)).collect(Collectors.toSet());
        System.out.println("Duplicates: " + duplicates);

        // 10. Remove Duplicates
        List<Integer> uniqueList = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique Numbers: " + uniqueList);

        // 11. Flatten a List of Lists
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        // 12. Find Second-Highest Number
        int secondHighest = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println("Second Highest: " + secondHighest);

        // 13. Parallel Stream Sum
        int parallelSum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Parallel Stream Sum: " + parallelSum);

        Collection<Integer> employees;
		// 14. Convert List to Map (Employee ID → Employee Name)
   //     Map<Object, Object> employeeMap = employees.stream().collect(Collectors.toMap;//(e -> e.id, e -> e.name));
      //  System.out.println("Employee Map: " + employeeMap);

        // 15. Count Occurrences of Each Character in a String
        String input = "aabbcdeff";
        Map<Character, Long> charCount = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Character Count: " + charCount);

        // 16. Check If Two Strings Are Anagrams
        String str1 = "listen", str2 = "silent";
        boolean areAnagrams = str1.chars().sorted().boxed().collect(Collectors.toList()).equals(str2.chars().sorted().boxed().collect(Collectors.toList()));
        System.out.println("Are Anagrams: " + areAnagrams);
    }
}