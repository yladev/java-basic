package day19.collectionFramework;

import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    int age;
    String gender;
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
public class Example {
    public static void main(String[] args) {
        List<Person> student = new ArrayList<>();
        student.add(new Person("Jason Andrew", 17, "male"));
        System.out.println(student);


    }
}
