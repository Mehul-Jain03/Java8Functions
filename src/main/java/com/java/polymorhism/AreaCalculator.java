package com.java.polymorhism;

public class AreaCalculator {

    //Square

    public int getArea(int side){
        return side * side;
    }

    public double getArea(double side){
        return side * side;
    }

    //Rectangle
    public int getArea(int length ,int breadth){
        return length * breadth;
    }

    public double getArea(double length ,double breadth){
        return length * breadth;
    }

    public static void main(String[] args) {
        AreaCalculator area = new AreaCalculator();
        System.out.println(area.getArea(5));
        System.out.println(area.getArea(5.25));
        System.out.println(area.getArea(3,4));
        System.out.println(area.getArea(3.25,4.25));
    }

}
