package com.nirxzyyy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext x=new ClassPathXmlApplicationContext("config.xml");
        Student student= (Student) x.getBean("s1");
        System.out.println(student);


        ApplicationContext y=new ClassPathXmlApplicationContext("config.xml");
        Student student2= (Student) y.getBean("s2");
        System.out.println(student2);



    }
}
