package com.refrenceObjUsingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("hello world");

        ApplicationContext x=new ClassPathXmlApplicationContext("configrefrenceObjUsingBean.xml");
        B temp=(B) x.getBean("bref");
        System.out.println(temp.getY());
        System.out.println(temp.getAobj().getX());
    }
}
