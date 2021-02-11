package com.CompnentJava;

public class Company {
    private Emp emp;

    public Company(Emp emp) {
        this.emp = emp;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Company{" +
                "emp=" + emp +
                '}';
    }

    public void companyHey(){
        System.out.println("hey working in company");
    }
}
