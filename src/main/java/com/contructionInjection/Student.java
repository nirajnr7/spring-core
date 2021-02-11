package com.contructionInjection;

public class Student {
    private String name;
    private int roll;
    private Certificate certificate;

    public Student(String name, int roll,Certificate certificate) {
        this.name = name;
        this.roll = roll;
        this.certificate=certificate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", certificate=" + certificate +
                '}';
    }
}
