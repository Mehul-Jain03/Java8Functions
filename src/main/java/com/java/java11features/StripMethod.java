package com.java.java11features;


public class StripMethod {

    public static void main(String[] args) {
        char c = '\u2002';
        String str = c + "mehul" + c;
        System.out.println("::" +str.trim() + "::");
        System.out.println("::" +str.stripLeading() + "::");
        System.out.println("::" +str.stripTrailing() + "::");
        System.out.println("::" +str.strip() + "::");
    }
}