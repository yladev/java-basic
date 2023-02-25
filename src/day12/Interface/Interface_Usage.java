package day12.Interface;
interface Calculate{
    void Calculate(int c);
}
interface Cal{
    void cal(int num1, int num2);
}
class  Sum implements Cal{
    @Override
    public void cal(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
class Sub implements Cal {
    @Override
    public void cal (int num1, int num2) {
        System.out.println(num1 - num2);
    }
}
public class Interface_Usage {
    void sum (int a, int b, Cal obj) {
        obj.cal(a, b);
    }

    public static void main(String[] args) {
        Interface_Usage obj = new Interface_Usage();
        obj.sum(3, 4, new Sum());
        obj.sum(17, 7, new Sub());
        Calculate calculate = c -> {}; // lambda function
    }
}