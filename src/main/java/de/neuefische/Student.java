package de.neuefische;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;
    private int matriculationnumber;

    public Student (String firstname, String lastname, int matriculationnumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.matriculationnumber = matriculationnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public int getMatriculationnumber() {
        return matriculationnumber;
    }

    public void setMatriculationnumber(int matriculationnumber){
        this.matriculationnumber = matriculationnumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", matriculationnumber=" + matriculationnumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matriculationnumber == student.matriculationnumber && Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, matriculationnumber);
    }
}
