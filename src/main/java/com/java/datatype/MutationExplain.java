package com.java.datatype;

import java.util.Arrays;

public class MutationExplain {


    public static void main(String[] args) {
        int[] arr =  new int[] {1,2,3,};

        futureSale(arr);
        totalSale(arr);

    }

    public static void futureSale(int[] a){
        a  =  Arrays.copyOf(a,a.length);
        a[0]++;
        a[1]++;
        System.out.println("Future Sale is "+ (a[0]+a[1]+a[2]));

    }

    public static void totalSale(int[] a){
       System.out.println("Total Sale is "+ (a[0]+a[1]+a[2]));
    }


}
