package day4.controlflowstatement.decisionmaking;

public class MarkResult {
    public static void main(String[] args) {

        int mark1 = 100;
        int mark2 = 75;
        int mark3 = 60;
        int mark4 = 40;

        if (mark1 >= 75 && mark1 <= 100) {
            System.out.println("Distinction");
            System.out.println("Congratulation");
        if (mark2 >= 60 && mark2 <= 75) {
            System.out.println("Credit");
        }
        if (mark3 >= 40 && mark3 <= 60) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
            System.out.println("Better luck next tie");
        }
        }
    }
}
