package day10.oop.oop;

public class HierarchicalInheritance {
    int a = 11;
}

class D extends HierarchicalInheritance{
    public static void main(String[] args) {
        D obj = new D();
        System.out.println(obj.a);
    }
}

class E extends  HierarchicalInheritance{
    public static void main(String[] args) {
        E obj = new E();
        System.out.println(obj.a);
    }
}