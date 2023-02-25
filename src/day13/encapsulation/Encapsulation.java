package day13.encapsulation;

import java.sql.SQLOutput;

class Person {
    String name;
    int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Jason Andrew", 17);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}