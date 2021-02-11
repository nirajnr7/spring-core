package com.LifecycleXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello world");
        AbstractApplicationContext x=new ClassPathXmlApplicationContext("configLifecycleXml.xml");
        x.registerShutdownHook();

//        Samosa s=(Samosa) x.getBean("s1");
//        System.out.println(s);
//
//
//        System.out.println("__________");
//        Pepsi p= (Pepsi) x.getBean("p1");
//        System.out.println(p);

            Pizza p=(Pizza) x.getBean("pizza");
            System.out.println(p);


    }
}
