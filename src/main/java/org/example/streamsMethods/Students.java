package org.example.streamsMethods;

import java.util.List;
import java.util.Objects;

public class Students {
  private  String name;
  private String age;

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Students{" +
        "name='" + name + '\'' +
        ", age='" + age + '\'' +
        '}';
  }

  public Students setName(String name) {
    this.name = name;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Students students = (Students) o;
    return Objects.equals(name, students.name) && Objects.equals(age,
        students.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  public String getAge() {
    return age;
  }

  public Students setAge(String age) {
    this.age = age;
    return this;
  }

  public Students(String name, String age) {
    this.name = name;
    this.age = age;
  }

}
