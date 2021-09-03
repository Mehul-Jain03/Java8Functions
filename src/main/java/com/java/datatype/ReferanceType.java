package com.java.datatype;

import java.util.Arrays;

public class ReferanceType {

    //This is Pass by Referance

    public static void main(String[] args) {
        int[] arr =  {1,2,3,};
        System.out.println("Before "+ Arrays.toString(arr));
        change(arr);
        System.out.println("Before "+ Arrays.toString(arr));

    }

    public static void change(int[] a){
        a[0]++;
        a[1]++;
        a[2]++;
    }
}
