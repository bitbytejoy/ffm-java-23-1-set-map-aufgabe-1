package de.neuefische;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        Student student1 = new Student("Max", "Mustermann", 12345);
        Student student2 = new Student("Anna", "Musterfrau", 54321);
        Student student3 = new Student("Tina", "Bierfrau", 12345);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);


        school.printAllStudents();

        int searchnumber = 13007;
        Student foundstudent = school.findStudentById(searchnumber);

        if (foundstudent != null) {
            System.out.println("Gefundener Studen: " + foundstudent);
        } else {
            System.out.println("Student mit Martikelnummer " + searchnumber + " nicht gefunden.");
        }

        int removingmarticulationnumber = 12345;
        boolean removed = school.removeStudentById(removingmarticulationnumber);

        if (removed) {
            System.out.println("Student mit der Matrikelnummer " + removingmarticulationnumber + " wurde entfernt.");
        } else {
            System.out.println(" Studen mit der Matrikelnummer " + removingmarticulationnumber + " konnte nicht gefunden werden.");
        }

        school.printAllStudents();
    }

    public static void setDemo() {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits);

        System.out.println(fruits.contains("Apple"));

        fruits.remove("Apple");

        System.out.println(fruits);
    }

    public static void mapDemo() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 95);
        map.put("Bob", 88);
        map.put("Alice", 85);

        System.out.println(map);

        System.out.println(map.get("Alice"));

        System.out.println(map.containsKey("Blabla"));

        map.remove("Alice");
        System.out.println(map);
    }

    public static void setWithCustomClassDemo() {
        Set<Student> students = new HashSet<>();

//        students.add(new Student("a123", "Alice"));
//        students.add(new Student("a123", "Alice"));

        System.out.println(students);
    }
}