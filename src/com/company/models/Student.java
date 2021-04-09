package com.company.models;

import java.util.Arrays;

public class Student extends User {

    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + Arrays.toString(courses) +
                ", indexOfCourses=" + indexOfCourses +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(String course){
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }


}
