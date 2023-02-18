package day11.aggregation;
class Engine{
    void status() {
        System.out.println("Engine is working");
    }
}

public class Car {
    public void start (Engine engine) {
        engine.status();
    }
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car();
        car.start(engine);
    }
}