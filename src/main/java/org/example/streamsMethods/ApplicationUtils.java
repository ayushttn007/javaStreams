package org.example.streamsMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationUtils {

  public static List<Students> getStudents(){
    List<Students> listOfStudents =  new ArrayList<>();
    Students students1 = new Students("ayush","23");
    Students students2 = new Students("Itachi Uchiha","25");
    Students students3 = new Students("Levi","20");
    Students students4 = new Students("Light Yagami","20");
    Students students5 = new Students("Izuku Midoriya","15");
    Students students6 = new Students("sharma","13");
    Students students7 = new Students("","");
    listOfStudents.add(students1);
    listOfStudents.add(students2);
    listOfStudents.add(students3);
    listOfStudents.add(students4);
    listOfStudents.add(students5);
    listOfStudents.add(students6);
    listOfStudents.add(students7);
    return listOfStudents;

  }

  public static List<String> getStudentsName(){
    List<String> list = Arrays.asList("ayush","Levi","Light Yagami","Izuku Midoriya");
    return list;
  }
}
