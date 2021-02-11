package com.LifecycleXml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price='" + price + '\'' +
                '}';
    }

    @PostConstruct
    public  void start(){
        System.out.println("start kar rhe ");
    }
    @PreDestroy
    public void end(){
        System.out.println("end kar rhe");
    }
}
