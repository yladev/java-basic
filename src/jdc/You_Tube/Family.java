package jdc.You_Tube;

public class Family {

    public static void main(String[] args) {

        //creating an object//
        Parent so = new Parent(); //created zoo object//
               so.name = "Zaw Oo";
               so.age = 58;
               so.gender = "male";
               so.address = "South Okkalapa Township";
               so.religious = "Buddhism";
               so.job = "Shopkeeper";

        Parent mm = new Parent(); //created mm object//
               mm.name= "Tin Tin Moe";
               mm.age = 50;
               mm.gender = "female";
               mm.address = "South Okkalapa Township";
               mm.religious = "Buddhism";
               mm.job = "House-Wife";

        so.introduction();
        mm.introduction();
    }
}



//Parent Class//
class Parent{

    String name;
    int age;
    String gender;
    String address;
    String religious;
    String job;

    void introduction() {

        System.out.println("My name is " + name);
        System.out.println("My age is " + age + " years old");
        System.out.println("My gender is " + gender);
        System.out.println("My address is " + address);
        System.out.println("My religious is " + religious);
        System.out.println("My job is " + job );

    }
}
