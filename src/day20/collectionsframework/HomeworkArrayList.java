package day20.collectionsframework;

import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    static int age;
    String gender;
    int id;
    public Person(String name, int age, String gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }
}
public class HomeworkArrayList {
    public static void main(String[] args) {
        List<Person> identity = new ArrayList<>();
        identity.add(new Person("Jason Andrew", 17, "male", 12));
        List<Object> obj = new ArrayList<>();
        if (Person.age >= 18) {
            System.out.println("Over 18 years old");
        } else {
            System.out.println("Under 18 years old");
        }
    }
}