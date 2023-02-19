package day1.lesson1;

public class Test {

    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 15;
        System.out.println(number1 * number2);

        String firstName = "Jason";
        String lastName = "Andrew";
        System.out.println(firstName + " " +lastName);

        int x = 14;
        int y = 14;
        System.out.println(x + y);

        float j = 1.1f;
        float a = 1.0f;
        System.out.println(j * a);

        for (String s : args){
            System.out.println("Fuck -> " + s);
        }
    }
}