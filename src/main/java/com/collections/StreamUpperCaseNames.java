package com.vetias.java.workshop.Collections;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("dhanushya");
        names.add("roshan");
        names.add("kirthik");
        names.add("rishika");
        names.add("shrika");
        names.add("pramisha");
        names.stream()
        .filter(name -> name.startsWith("s") || name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
        
    }
    
}

