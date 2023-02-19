package day12.multiple_inheritance_interface;
interface Parent1 {
    void doItP1();
}
interface Parent2 {
    void doItP2();
}
public class MultipleInheritance implements Parent1,Parent2{
    @Override
    public void doItP1() {
        System.out.println("From P1");
    }

    @Override
    public void doItP2() {
        System.out.println("From P2");
    }

    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.doItP1();
        multipleInheritance.doItP2();
    }
}