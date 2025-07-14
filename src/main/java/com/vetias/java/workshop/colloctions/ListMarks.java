package com.vetias.java.workshop.colloctions;
import java.util.Collection;

public class ListMarks {

    public static void main(String[]args) {
        List<Intger> marks = new ArrayList<>();
        marks.add(100);
        marks.add(90);
        marks.add(80);
        marks.add(70);
        marks.add(60);
        System.out.println("Ascending order");
        Collection.sort(marks);
        System.out.println(marks);
        System.out.println("Descending order");
        Collection.sort(marks, Collections.reverseOrder());
        System.out.println(marks);
    }
}