package com.SteroType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("#{new java.lang.String('niar ')}")
    private String studentName;
    @Value("jadugoda")
    private  String city;
    @Value("#{temp}")
    private List<String> address;

    @Value("#{100+200}")
    private int x;
    @Value("#{100>200? 123:456}")
    private int y;

    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int z;
    @Value("#{T(java.lang.Math).PI}")
    private int a;
    @Value("100000000")
    private int b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
