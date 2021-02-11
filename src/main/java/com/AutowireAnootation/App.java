package com.AutowireAnootation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hellwowo");

        ApplicationContext x=new ClassPathXmlApplicationContext("configAutowire.xml");
        Emp e=x.getBean("e1",Emp.class);
        System.out.println(e.toString());
    }
}
