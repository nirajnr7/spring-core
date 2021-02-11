package com.contructionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello World");

        ApplicationContext x=new ClassPathXmlApplicationContext("configContructionInjection.xml");
        Student s= (Student) x.getBean("s1");
        System.out.println(s.toString());

    }
}
