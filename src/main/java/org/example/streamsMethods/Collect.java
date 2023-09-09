package org.example.streamsMethods;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static org.example.streamsMethods.ApplicationUtils.getStudents;
import static org.example.streamsMethods.ApplicationUtils.getStudentsName;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collect {

public static List<Students> students = getStudents();
public static List<String> studentsName = getStudentsName();
  public static List<String> getStudentNames() {
      return studentsName.stream()
          .filter(student -> !student.equals("ayush")).collect(toList());
  }

  public static LinkedList<String> getStudentsNameInLinkedList(){
    return studentsName.stream().filter(student -> !student.isEmpty()).collect(toCollection(LinkedList::new));
  }

  public static TreeSet<String> getStudentsNameInTreeSet(){
    return studentsName.stream().filter(student -> !student.isEmpty()).collect(toCollection(TreeSet::new));
  }

  public static Map<String,String> getStudentsNameInMap(){
    return students.stream().filter(student -> !student.getName().isEmpty() && !student.getAge().isEmpty()).collect(Collectors.toMap(student -> student.getName().toLowerCase() ,student -> student.getAge().toLowerCase()));
  }

  public static Long getNumberOfStudents(){
    return students.stream().filter(student -> student.getName().startsWith("L") && student.getAge().equals("20")).count();
  }
}
