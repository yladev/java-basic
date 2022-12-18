package You_Tube;

public class Person {

    public static void main(String[] args) {

        //creating an object//

        Student ja = new Student(); //created ja object//
                ja.name = "Yan Linn Aung";
                ja.age = 17;
                ja.gender = "male";
                ja.education = "Level-3 Diploma In Computing";
                ja.address = "South Okkalapa Township";
                ja.materialStatus = "Single";

        Student victor = new Student(); //creates victor object//
                victor.name = "Thuta Sann";
                victor.age = 20;
                victor.gender = "male";
                victor.education = "level-6 Bachelor In Computing";
                victor.address = "South Okkalapa Township";
                victor.materialStatus = "In A Relationship";

                victor.greet();
                ja.greet();
    }
}






//Student Class//

class Student{

    String name;
    int age;
    String gender;
    String education;
    String address;
    String materialStatus;

    void greet() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age + " years old");
        System.out.println("My gender is " + gender) ;
        System.out.println("My education is " + education);
        System.out.println("My address is " + address);
        System.out.println("My materialStatus is " + materialStatus);
    }
}


