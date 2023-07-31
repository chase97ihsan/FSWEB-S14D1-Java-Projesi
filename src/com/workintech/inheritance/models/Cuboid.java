package com.workintech.inheritance.models;

public class Cuboid extends Rectangle {

    private int height;

    public Cuboid(int width,int length,int height){
        super(width,length);
        if(height<0){
            this.height=0;
        }else {
            this.height=height;
        }
    }
    public int getHeight() {
        return height;
    }
    public int getVolume(){
        return super.getArea()*height;
    }
}
