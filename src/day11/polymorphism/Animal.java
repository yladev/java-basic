package day11.polymorphism;
    // method overriding
public class Animal {
    void legs() {
        System.out.println("Animals have four legs");
    }
    void voice() {
        System.out.println("Dogs are barking");
    }
}
class Human extends Animal {
    @Override
    void legs() {
        super.legs();
        System.out.println("Human has two legs");
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Human are speaking");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.legs();
        human.voice();
    }
}