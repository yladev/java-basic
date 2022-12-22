package You_Tube;

public class Bicycle {

    String name;
    String model;

    //constructor
    Bicycle(String name,String model){
        this.name=name;
        this.model=model;
    }

    void showInfo(){
        System.out.println("name: This bicycle name is " + name);
        System.out.println("model: This bicycle model is " + model);
    }
}

