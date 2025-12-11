package rvt;

import java.util.ArrayList;

public class App {
  public static void main ( String[] args ) {
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    print_persons(persons);
  }

  public static void print_persons(ArrayList<Person> persons) {
    for (int i = 0; i < persons.size(); i++) {
      System.out.println(persons.get(i));
    }
  }
}