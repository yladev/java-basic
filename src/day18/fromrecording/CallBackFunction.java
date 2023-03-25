package day18.fromrecording;
interface Callable {
    void m1 (int a, int b);
}

public class CallBackFunction {
    void m2 (int a, int b, Callable obj){
        obj.m1(a, b);
    }
    static void m3 (int a, int b, Callable obj){
        obj.m1(a, b);
    }
    public static void main(String[] args) {
        CallBackFunction obj = new CallBackFunction();
        obj.m2(2, 3, (a, b) -> System.out.println("This is addition => " + (a + b)));
        CallBackFunction obj2 = new CallBackFunction();
        obj2.m2(20, 2, (a, b) -> System.out.println("This is division => " + (a / b)));
        CallBackFunction.m3(3, 4, (a, b) -> System.out.println(a * b));
    }
}