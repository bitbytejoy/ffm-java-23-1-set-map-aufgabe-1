package de.neuefische;

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
}