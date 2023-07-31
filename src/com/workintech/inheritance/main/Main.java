package com.workintech.inheritance.main;
import com.workintech.inheritance.models.*;

import java.util.Arrays;

public class Main {


    public static void workWithData(){

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("-------------------");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("-------------------");

        JuniorDeveloper junior1=new JuniorDeveloper(1,"İhsan",20000);
        junior1.work();

        JuniorDeveloper junior2=new JuniorDeveloper(2,"Ali",20000);
        junior2.work();

        MidDeveloper mid1=new MidDeveloper(3,"Mehmet",30000);
        mid1.work();
        MidDeveloper mid2=new MidDeveloper(4,"Kemal",30000);
        mid2.work();
        MidDeveloper mid3=new MidDeveloper(5,"Naci",30000);
        mid3.work();

        SeniorDeveloper senior=new SeniorDeveloper(6,"Şeref",40000);
        senior.work();

        HrManager hrManager=
                new HrManager(1,"Pınar",45000,new JuniorDeveloper[2],new MidDeveloper[3], new SeniorDeveloper[1]);

        hrManager.addEmployee(0,junior1);
        hrManager.addEmployee(1,junior2);
        hrManager.addEmployee(0,mid1);
        hrManager.addEmployee(1,mid2);
        hrManager.addEmployee(0,senior);

        System.out.println(Arrays.toString(hrManager.getJuniors()));
        System.out.println(Arrays.toString(hrManager.getMids()));
        System.out.println(Arrays.toString(hrManager.getSeniors()));




    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        workWithData();
    }
}