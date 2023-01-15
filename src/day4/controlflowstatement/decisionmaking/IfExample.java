package day4.controlflowstatement.decisionmaking;

public class IfExample {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1 = 10;
        num2 = 20;

        if (num1 < num2) {
            System.out.println("number one is greater than number two"); // statement
        }

        if (num1 > num2) {
            System.out.println("number one is greater than number two");
        }
        else {
            System.out.println("number two is grater than number one");
        }

        // if(){} else(){}.....else{}
        String name = "Jason";

        if (name == "Andrew") {
            System.out.println("this is Andrew");
        } else if (name == "Yan") {
            System.out.println("this is Yan");
        } else if (name == "Linn") {
            System.out.println("this is Linn");
        } else if (name == "Jason") {
            System.out.println("this is Jason");
        } else {
            System.out.println("invalid name");
        }

        // if(){if(){}}
        int a = 10;
        int b = 15;
        int c = 20;

        if (c > b) {
            System.out.println("c is greater than b");
            if (c > a) {
                System.out.println("c is the greatest");
            }
        }
    }

}
