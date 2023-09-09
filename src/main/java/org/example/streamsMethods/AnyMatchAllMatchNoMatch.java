package org.example.streamsMethods;

import static org.example.streamsMethods.ApplicationUtils.getStudents;

import java.util.List;

public class AnyMatchAllMatchNoMatch {
public static List<Students> listOfStudents = getStudents();
  public static boolean allMatch(){
   return listOfStudents.stream().allMatch(student -> student.getAge().equals("23"));
  }

  public static boolean anyMatch(){
    return listOfStudents.stream().anyMatch(student -> student.getAge().equals("23"));
  }

  public static boolean noneMatch(){
   return listOfStudents.stream().noneMatch(student -> student.getAge().equals("23") && student.getName().equals("ayush"));
  }
}
