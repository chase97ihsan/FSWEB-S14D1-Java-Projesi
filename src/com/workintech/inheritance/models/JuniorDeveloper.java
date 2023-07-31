package com.workintech.inheritance.models;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id,String name,int salary){
        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println(super.getName()+" is ready to work:)");
    }
}
