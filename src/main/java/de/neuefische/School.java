package de.neuefische;

import java.util.HashMap;
import java.util.Map;

public class School {
    private final Map<Integer, Student> studentMap;

    public School() {
        this.studentMap = new HashMap<>();
    }

    public void addStudent (Student student) {
        studentMap.put(student.getMatriculationnumber(), student);
    }
    public boolean removeStudentById(int matriculationnumber) {
        Student student = studentMap.remove(matriculationnumber);
        return student != null;
    }

    public void printAllStudents() {
        System.out.println(studentMap);
    }

    public Student findStudentById(int matriculationnumber) {
        return studentMap.get(matriculationnumber);
    }
}
