package com.CompnentJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext x=new AnnotationConfigApplicationContext(Config.class);
        Student s=x.getBean("student",Student.class);
       s.hey();

       Emp e=x.getBean("getEmp",Emp.class);
       e.working();

       Company c=x.getBean("getCompany",Company.class);
       c.companyHey();

    }
}
