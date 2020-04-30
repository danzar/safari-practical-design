package students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//interface Predicate<E> {
//  boolean test(E e);
//}
public class School {
  // arguments should be as "accepting" as possible--constrain the caller
  // returns constrain my implementation
  // Command pattern: pass an object as a function arg because of the
  // BEHAVIOR it contains
  // Functional programming: "one form of 'higher order function'"
  public static <E> List<E> getByCriterion(Iterable<E> ls, Predicate<E> crit) {
    List<E> out = new ArrayList<>();
    for (E s : ls) {
      if (crit.test(s)) { // changes independently of the rest
        out.add(s);
      }
    }
    return out;
  }
  public static void show(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("==============================");
  }
  public static void main(String[] args) {
    List<Student> roster = Arrays.asList(
        Student.of("Fred", 78, "Math", "Physics"),
        Student.of("Jim", 65, "Art"),
        Student.of("Sheila", 98, "Math", "Physics", "Quantum Mechanics", "Astrophysics")

    );
    show(getByCriterion(roster, s -> s.getGrade() > 70));
  }
}
