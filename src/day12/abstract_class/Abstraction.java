package day12.abstract_class;

abstract  class A{
    abstract void doIt();
    void making(){
        System.out.println("This is making");
    };
}

public class Abstraction extends A {
    @Override
    void doIt() {
        System.out.println("This is doing HomeWork");
    }
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.doIt();
        abstraction.making();
    }
}

class C extends A {
    @Override
    void doIt() {
        System.out.println("This is doIT from A");
    }
    @Override
    void making() {
        System.out.println("This is making from A");
    }
    public static void main(String[] args) {
        C c = new C();
        c.doIt();
        c.making();

        Abstraction abstraction = new Abstraction();
        abstraction.doIt();
        abstraction.making();
    }
}