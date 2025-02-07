package com.WiproException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

// Assuming Student class is defined in Wipro.com.Package


public class Test7 {

    public static void main(String[] args) {
        // Create a SortedMap with Student as key and Long as value
        SortedMap<Student, Long> sm = new TreeMap<>(new StudentNameComparator());

        // Create Student objects
        Student kabeer = new Student("Kabeer", 101);
        Student mayank = new Student("Mayank", 102);
        Student rj = new Student("RJ", 103);

        // Add entries to the SortedMap
        sm.put(kabeer, 9848426L);
        sm.put(mayank, 76577767L);
        sm.put(rj, 876767868L);

        // Convert the SortedMap entries to a List
        List<Map.Entry<Student, Long>> list = new ArrayList<>(sm.entrySet());

        // Sort the List using MyComparator
        Collections.sort(list, new MyComparator());

        // Print the sorted List
        for (Map.Entry<Student, Long> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Print the SortedMap directly
        for (Map.Entry<Student, Long> entry : sm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

// Comparator to sort Students by name
class StudentNameComparator implements java.util.Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

// Comparator to sort Map entries by value (phone number)
class MyComparator implements java.util.Comparator<Map.Entry<Student, Long>> {
    @Override
    public int compare(Map.Entry<Student, Long> e1, Map.Entry<Student, Long> e2) {
        return e1.getValue().compareTo(e2.getValue());
    }
}

// Student class definition
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}
 
 
