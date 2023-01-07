package jdc.You_Tube;

public class BicycleTest {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("BMX","2022");
        bicycle.showInfo();

        Bicycle mountain = new Bicycle("Mountain", "2010");
        mountain.showInfo();

        Bicycle japan = new Bicycle("japan","2020");
        japan.showInfo();
    }
}
