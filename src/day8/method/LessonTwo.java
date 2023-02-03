package day8.method;

public class LessonTwo {
    static String name(){
        System.out.println("Testing");
        return "Jason";
    }
    static int age(){
        return 17;
    }
    static void eat(){
        System.out.println("I am a student.");
    }

    public static void main(String[] args) {
        System.out.println(LessonTwo.name());
        System.out.println(LessonTwo.age());
        LessonTwo.eat();
    }
}

// method with parameter
class B{
    static void age (String a, int b) {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        B.age("Jason Andrew", 17);
    }
}
