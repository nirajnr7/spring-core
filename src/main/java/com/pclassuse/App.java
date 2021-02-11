package com.pclassuse;

import com.nirxzyyy.Student;
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
        ApplicationContext x=new ClassPathXmlApplicationContext("configpclass.xml");
        Student student= (Student) x.getBean("s1");
        System.out.println(student);


        ApplicationContext y=new ClassPathXmlApplicationContext("configpclass.xml");
        Student student2= (Student) y.getBean("s2");
        System.out.println(student2);



    }
}
