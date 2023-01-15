package day4.controlflowstatement.decisionmaking;

public class Switch {
    public static void main(String[] args) {
        String animal = "dog";
        switch (animal) {
            case ("cat"):
                System.out.println("this is cat");
                break;
            case ("cow"):
                System.out.println("this is cow");
                break;
            case ("dog"):
                System.out.println("this is dog");
                break;
            case ("rabbit"):
                System.out.println("this is rabbit");
                break;
            default:
                System.out.println("there is no animal");
        }
    }
}
