package com.java.assignmets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/java/com/java/assignmets/first-names.txt");
        List<String> list =  Files.readAllLines(path);

        // 1 List of Names which start with B
        // System.out.println(list.stream().filter(str -> str.charAt(0) == 'B').count());

        // 2 Create a list which contains name Starts with C and that name contains s in it
        // List<String> listNew = list.stream().filter(str -> str.charAt(0) == 'C' && str.toLowerCase().contains("s")).collect(Collectors.toList());
        // System.out.println(listNew.size());

        // 3 Print the total numbers of chars of Names Starting with M
        // System.out.println(list.stream().filter(str -> str.charAt(0) == 'M').map(s -> s.length()).mapToInt(a -> a).sum());

        // 4 Collect the names in a list which has - in it and replace - with space
        List<String> listNewNew =  list.stream().filter(name -> name.contains("-")).map(name -> name.replace("-","  ")).collect(Collectors.toList());
        System.out.println(listNewNew.size());

        // 5 Find the name which has more numbers of chars
        Optional<String> maxLenName = list.stream().max(Comparator.comparing(name -> name.length()));
        System.out.println(maxLenName.get());
    }
}