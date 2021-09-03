package com.java.java10features;

import java.util.List;
import java.util.Map;

public class VarVariable {

    public static void main(String[] args) {
        //1. Limitations of var -> Can be used inside method body only.
        var num = 10;
        var list = List.of(1,4,7,9);
        var map = Map.of("a",10,"b",20);

        //2. Below ex would not work it should know while declaring only.
/*        var a;
        a =10;*/

        //3. Can't be used as return type and argument type.

        //4. var is not a key word.

        //5. Generics can't be used in var - right side need to have generics type.
    }
}