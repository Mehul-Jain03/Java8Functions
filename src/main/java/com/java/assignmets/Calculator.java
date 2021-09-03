package com.java.assignmets;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static final Map<String,MathOperation> map = new HashMap<>();

    static {
        map.put("+",(a,b) -> (a+b));
        map.put("-",(a,b) -> (a-b));
        map.put("*",(a,b) -> (a*b));
        map.put("/",(a,b) -> (a/b));
    }

    public static void addOp(String key,MathOperation mp){
        map.put(key,mp);
    }

    public static int calculate(String s){
        String[] sArray = s.split(" ");
        int onScreenNumber = Integer.parseInt(sArray[0]);
        for (int i = 1; i < sArray.length; i=i+2) {
         MathOperation op = map.get(sArray[i]);
         int enteredNumber = Integer.parseInt(sArray[i+1]);
            onScreenNumber = calculate(onScreenNumber,op,enteredNumber);
        }
        return onScreenNumber;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1 + 2 - 3 + 4"));
    }

    private static int calculate(int onScreenNumber,MathOperation mathOperation,int enteredNumber){
        return mathOperation.operate(onScreenNumber,enteredNumber);
    }
}