package day12.abstract_class;

abstract class abstractExample{
    abstract void AB();
    abstract void CD();
}

public class AbstractionExample extends abstractExample{
    @Override
    void AB(){
        System.out.println("This is abstraction example");
    }
    @Override
    void CD(){
        System.out.println("This is CD");
    }
    public static void main(String[] args) {
        AbstractionExample abstractionExample = new AbstractionExample();
        abstractionExample.AB();
        abstractionExample.CD();
    }
}