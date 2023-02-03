package day8.method;

public class LessonOne {
    void doSomething() {
        System.out.println("Doing Something");
    }

    public static void main(String[] args) {
        LessonOne obj = new LessonOne(); // constructor
        System.out.println(obj instanceof LessonOne);
        obj.doSomething();

        A obj1 = new A();
        obj1.eat();
        A.recall();
    }
}

class A {
    void eat() {
        System.out.println("I'm Yan Linn Aung");
    }
    static void recall(){
        System.out.println("This is static method");
    }
}