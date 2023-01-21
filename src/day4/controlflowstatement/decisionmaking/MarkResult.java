package day4.controlflowstatement.decisionmaking;

public class MarkResult {
    public static void main(String[] args) {

        int mark = 0;
        if( mark >= 75 && mark <= 100){
            System.out.println("Distinction");
        } else if (mark >= 60 && mark <= 75) {
            System.out.println("Credit");
        } else if (mark >= 40 && mark <= 60) {
            System.out.println("pass");
        } else if (mark < 40) {
            System.out.println("fail");
        } else {
            System.out.println("invalid mark");
        }
    }
}
