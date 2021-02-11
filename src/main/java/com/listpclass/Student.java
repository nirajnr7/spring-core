package com.listpclass;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private List<String> phone;
    private Set<String> city;
    private Map<String,String> courses;

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getCity() {
        return city;
    }

    public void setCity(Set<String> city) {
        this.city = city;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", city=" + city +
                ", courses=" + courses +
                '}';
    }
}
