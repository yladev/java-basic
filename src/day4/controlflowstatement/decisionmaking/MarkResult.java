package day4.controlflowstatement.decisionmaking;

public class MarkResult {
    public static void main(String[] args) {

//        int mark1 = 100;
//        int mark2 = 75;
//        int mark3 = 60;
//
//        if (mark1 >= 75 && mark1 <= 100) {
//            System.out.println("Distinction");
//            System.out.println("Congratulation");
//        if (mark2 >= 60 && mark2 <= 75) {
//            System.out.println("Credit");
//        }
//        if (mark3 >= 40 && mark3 <= 60) {
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//            System.out.println("Better luck next tie");
//        }
//        }

//        int mark1 = 100;
//        int mark2 = 75;
//        int mark3 = 60;
//
//        if (mark1 >= 75 && mark1 <= 100) {
//            System.out.println("Distinction");
//            System.out.println("Congratulation");
//        } else if (mark2 >= 60 && mark2 <= 75) {
//                System.out.println("Credit");
//        } else if (mark3 >= 40 && mark3 <= 60) {
//                System.out.println("Pass");
//        } else {
//                System.out.println("Fail");
//                System.out.println("Better luck next tie");
//        }

          int mya = 40;
          int eng = 76;
          int math = 80;

          if (mya >= 40 && eng >= 40 && math >= 40) {
              if (mya >= 80 || eng >= 80 || math >= 80) {
                  System.out.println("Distinction");
              } else {
                  System.out.println("Pass");
              }
          } else {
              System.out.println("Fail");
          }
    }
}
