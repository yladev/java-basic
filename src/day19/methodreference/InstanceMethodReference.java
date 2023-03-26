package day19.methodreference;
interface  Addable{
    void addition(int a, int b);
}
public class InstanceMethodReference {
    void add(int a, int b){
        System.out.println("Addition is => " + (a + b));
    }

    public static void main(String[] args) {
        Addable objAddition = new InstanceMethodReference()::add;
        objAddition.addition(17, 20);
    }
}