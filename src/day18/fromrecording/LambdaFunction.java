package day18.fromrecording;
// functional interface
interface Eatable{
    void eat();
}

public class LambdaFunction{
    public static void main(String[] args) {
        Eatable obj = () -> System.out.println("I eat Mala Xaing Guo and drink Bubble Tea");
        obj.eat();
        Eatable eatable1 = () -> System.out.println("I eat pizza");
        eatable1.eat();
    }
}