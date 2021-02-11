package com.CompnentJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.CompnentJava")
public class Config {
    @Bean
    public Emp getEmp(){
        return new Emp();
    }

    @Bean
    public Company getCompany(){
        return new Company(getEmp());
    }
}
