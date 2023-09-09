package org.example;

import static org.example.streamsMethods.AnyMatchAllMatchNoMatch.allMatch;
import static org.example.streamsMethods.AnyMatchAllMatchNoMatch.anyMatch;
import static org.example.streamsMethods.AnyMatchAllMatchNoMatch.noneMatch;
import static org.example.streamsMethods.Collect.getNumberOfStudents;
import static org.example.streamsMethods.Collect.getStudentNames;
import static org.example.streamsMethods.Collect.getStudentsNameInLinkedList;
import static org.example.streamsMethods.Collect.getStudentsNameInMap;
import static org.example.streamsMethods.Collect.getStudentsNameInTreeSet;
import static org.example.streamsMethods.FlatMap.useFlatMap;
import static org.example.streamsMethods.FlatMap.useFlatMapToDouble;
import static org.example.streamsMethods.FlatMap.useFlatMapToLong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
  public static void partice(){
    List<String> list = Arrays.asList("ayush","ayush","bingbing","a");
    List<Integer> list1 =  Arrays.asList(1, 3, 6, 8, 10, 18, 36);

    //Write a Java program to convert a list of strings to uppercase or lowercase using streams.
   System.out.println(list.stream().map(e->e.toUpperCase()).collect(Collectors.toList()));

   //Write a Java program to remove all duplicate elements from a list using streams.
    System.out.println(list.stream().distinct().collect(Collectors.toList()));

    //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
    System.out.println(list.stream().filter(e->e.startsWith("a")).count());

    //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
    System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    System.out.println(list.stream().sorted().collect(Collectors.toList()));

    //Write a Java program to find the maximum and minimum length of Strings in a list of String using streams
    System.out.println(list.stream().min(Comparator.comparing(String::length)).orElse("not found"));
    System.out.println(list.stream().max(Comparator.comparing(String::length)).orElse("not found"));

    //Write a Java program to find the maximum and minimum values in a list of integers using streams.
    System.out.println(list1.stream().min(Comparator.comparingInt(Integer::intValue)).orElse(null));
    System.out.println(list1.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(null));

    // Write a Java program to calculate the average of a list of integers using streams.
    System.out.println(list1.stream().collect(Collectors.averagingInt(Integer::intValue)));

    //Write a Java program to find the second smallest and largest elements in a list of integers using streams.
    //second smallest
    System.out.println(list1.stream().distinct().sorted().skip(1).findFirst().orElse(null));
    //second largest
    System.out.println(list1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null));

  }

  public static void main(String[] args) {
    System.out.println("java Streams");
    System.out.println(allMatch());  // false
    System.out.println(anyMatch());  // true
    System.out.println(noneMatch()); // false
    //---------collect Method----------------//
    System.out.println(getStudentNames());
    System.out.println(getStudentsNameInLinkedList().getFirst());
    System.out.println(getStudentsNameInTreeSet());
    System.out.println(getStudentsNameInMap());
    //-----------count Method--------------------//
    System.out.println(getNumberOfStudents());
    //-----------flatMap-----------------//
    System.out.println(useFlatMap());
    useFlatMapToDouble();
    System.out.println(useFlatMapToLong());
    partice();
  }
}