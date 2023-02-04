package day4.controlflowstatement.decisionmaking;

public class MarkResult {
    public static void main(String[] args) {
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
