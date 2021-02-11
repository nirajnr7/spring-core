package com.listpclass;

import org.springframework.context.ApplicationContext;
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



        ApplicationContext y=new ClassPathXmlApplicationContext("configlistpclass.xml");
        Student s= (Student) y.getBean("s1");
        System.out.println(s);




    }
}
