package org.example.streamsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
public class FlatMap {

  public static List<Integer> list1 = Arrays.asList(20,10,30,40,50);

  public static List<Integer> list2 = Arrays.asList(10,50,80,60);

  public static List<List<Integer>> list = new ArrayList<List<Integer>>();


  public static List<Integer> useFlatMap(){
    list.add(list1);
    list.add(list2);
    return list.stream().flatMap(list -> list.stream()).filter(element -> element <= 50).distinct().sorted().collect(toList());
//    return list.stream().flatMap(li -> li.stream()).collect(toList());
  }

  public static void useFlatMapToDouble(){
    //cannot use collect method in flatMapToDouble()
    List<Double>result = new ArrayList<>();
    list.add(list1);
    list.add(list2);
    list.stream().flatMapToDouble(list -> list.stream().mapToDouble(element -> element.doubleValue())).filter(element -> element <= 50).distinct().sorted().forEach(value -> result.add(value));
    System.out.println(result);
  }

  public static List<Integer> useFlatMapToLong(){
    list.add(list1);
    list.add(list2);
    return list.stream().flatMap(list -> list.stream()).filter(element -> element <= 50).distinct().sorted().collect(toList());
//    return list.stream().flatMap(li -> li.stream()).collect(toList());
  }

}
