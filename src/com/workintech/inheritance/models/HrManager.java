package com.workintech.inheritance.models;

public class HrManager extends Employee{


    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HrManager(long id, String name, int salary, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void addEmployee(int i,  JuniorDeveloper developer){
       try {
           if(juniors[i]==null){
               juniors[i]=developer;
           }
       }catch (ArrayIndexOutOfBoundsException exception){
           System.out.println("Index not found");
       }
    }
    public void addEmployee(int i,  SeniorDeveloper developer){
        try {
            if(seniors[i]==null){
                seniors[i]=developer;
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Index not found");
        }
    }
    public void addEmployee(int i,  MidDeveloper developer){
        try {
            if(mids[i]==null){
                mids[i]=developer;
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Index not found");
        }
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }

    @Override
    public void work() {
        System.out.println(super.getName()+" is ready to work:)");
    }
}
