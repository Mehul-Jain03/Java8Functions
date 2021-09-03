package com.java.comparator;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestStudent {

    public static void main(String[] args) {
        Student a = new Student("Mehul",23,55);
        Student b = new Student("Kartik",24,52);
        Student c = new Student("Jayesh",29,50);

      Optional<Student> op = Stream.of(a,b,c).max(Comparator.comparing(st -> st.getScore()));

        System.out.println(op.get());

    }
}