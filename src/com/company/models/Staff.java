package com.company.models;

import java.util.Arrays;

public class Staff extends User {

    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", subjects=" + Arrays.toString(this.getAllFromSubjects()) +
                ", indexOfSubject=" + indexOfSubject +
                ", id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public String[] getAllFromSubjects() {
        String [] strings = new String[indexOfSubject];
        for (int i = 0; i < strings.length; i++) {
            if (subjects[i] !=null) strings[i] = subjects[i];
        }
        return strings;
    }
}
