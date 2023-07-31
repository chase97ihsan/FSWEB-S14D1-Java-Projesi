package com.workintech.inheritance.models;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName()+" is ready to work:)");
    }
}
