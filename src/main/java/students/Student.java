package students;

import java.util.Arrays;
import java.util.List;

public class Student {
  private String name;
  private int grade;
  private List<String> courses;

  private Student(){}

  public static Student of(String name, int grade, String ... courses) {
    Student self = new Student();
    self.name = name;
    self.grade = grade;
    self.courses = Arrays.asList(courses);
    return self;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public List<String> getCourses() {
    return courses;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", grade=" + grade +
        ", courses=" + courses +
        '}';
  }
}
