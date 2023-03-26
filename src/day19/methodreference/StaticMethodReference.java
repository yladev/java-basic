package day19.methodreference;

// Interface obj = ClassName::method;
// static Method Reference
// instance Method Reference
// by constructor
interface Callable{
    void callMe();
}
public class StaticMethodReference {
    static void saySomething(){
        System.out.println("This is static method.");
    }

    public static void main(String[] args) {
        Callable obj = StaticMethodReference::saySomething;
        obj.callMe();
    }
}
