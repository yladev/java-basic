package day14.misc;

public class VarArgs {
    static void fullName(String firstName) {};
    static String fullName(String sirName, String firstName, String lastName) {
        return sirName + firstName + lastName;
    };
    static void name (String... var) {
        for (String s : var) {
            System.out.println(s);
        }
    };
    public static void main(String[] args) {
        fullName("Jason");
        System.out.println(fullName("Mr", "Jason", "Andrew"));
        name("Yan");
        name("Linn");
        name("Aung");
        name("Mg", "Yan", "Linn", "Aung");
    }
}