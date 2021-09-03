package com.java.assignmets;

public class TestAssignments {

    public static void main(String[] args) {

        MathOperation m1 = (a,b) -> (a+b);
        MathOperation m2 = (a,b) -> (a-b);
        MathOperation m3 = (a,b) -> (a*b);
        MathOperation m4 = (a,b) -> (a/b);

        /*  System.out.println(calculate(m1));
        System.out.println(calculate(m2));
        System.out.println(calculate(m3));
        System.out.println(calculate(m4));*/

        int onScreenNumber = 0;

        onScreenNumber = calculate(5,m1,2);
        onScreenNumber = calculate(onScreenNumber,m2,3);
        onScreenNumber = calculate(onScreenNumber,m3,7);
        onScreenNumber = calculate(onScreenNumber,m1,2);
        onScreenNumber = calculate(onScreenNumber,m4,3);

        System.out.println(onScreenNumber);

    }

 /*   private static int calculate(MathOperation mathOperation){
        int a = 10;
        int b = 5;
        return mathOperation.operate(a,b);
    }*/


    private static int calculate(int onScreenNumber,MathOperation mathOperation,int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
    }

}
