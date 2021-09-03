package com.java.datatype;

public class PrimitiveType {

    //Note : Java is always pass by value


    // This is Pass by value

    public static void main(String[] args) {
        int i = 5;
        System.out.println("Before : "+i);
        change(i);
        System.out.println("After : "+i);

    }

    public static void change(int a){
        a++;  //a = a+1;
    }
}
