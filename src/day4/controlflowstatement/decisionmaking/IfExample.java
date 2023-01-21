package day4.controlflowstatement.decisionmaking;

public class IfExample {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1 = 10;
        num2 = 20;

        // if(){};
        if (num1 < num2) {
            System.out.println("number two is greater than number one"); // statement
        }

        // if(){} else{};
        if (num1 > num2) {
            System.out.println("number one is less than number two");
        }
        else {
            System.out.println("number two is grater than number one");
        }

        // if(){} elseif(){}.....else{};
        String name = "Jason";

        if (name == "Andrew") {
            System.out.println("he is Andrew");
        } else if (name == "Yan") {
            System.out.println("he is Yan");
        } else if (name == "Linn") {
            System.out.println("he is Linn");
        } else if (name == "Jason") {
            System.out.println("he is Jason");
        } else {
            System.out.println("invalid name");
        }

        // if(){if(){}};3
        int a = 10;
        int b = 15;
        int c = 20;

        if (c > b) {
            System.out.println("c is greater than b");
            if (c > a) {
                System.out.println("c is the greatest");
            }
        }

        int number1 = 20;
        int number2 = 10;

        if (number1 < number2) {
            System.out.println("number1 is less than number2");
        } else if (number1 <= number2) {
            System.out.println("number1 is less than equal number2");
        } else if (number1 != number2) {
            System.out.println("number1 is not equal number2");
        } else if (number1 == number2) {
            System.out.println("number1 is equal to number2");
        } else if (number1 > number2) {
            System.out.println("number1 is greater than number2");
        } else {
            System.out.println("invalid number");
        }
    }

}
