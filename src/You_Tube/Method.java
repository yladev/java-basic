package You_Tube;

public class Method {
    public static void main(String[] args) {
        int result = add(4, 4, 4);
        System.out.println(result);

        String fullName = getFullName("Yan", "Linn", "Aung");
        System.out.println(fullName);

        sayHello();

        //instance method
        Method obj = new Method();
        obj.plus(4,2,8);

        //from otherClass
        Othermethod.displayMessage(4);
    }

    //add method
    static int add(int a, int b, int c){
        return a + b + c;
    }

    //fullName method
    static String getFullName(String firstName, String middleName, String lastName){
        return firstName + " " +  middleName + " " + lastName;
    }

    //sayHello void method
    static void sayHello(){
        System.out.println("Hello");
    }

    //instance method
    void plus(int a, int b, int c){
        System.out.println((a * b)-c);
    }
}



