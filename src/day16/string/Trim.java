package day16.string;

public class Trim {
    public static void main(String[] args) {
        System.out.println("Mg Mg".equals(" Mg Mg".trim()));
        System.out.println("Mg Mg".equals(" Mg Mg"));
        System.out.println(" MgMg".trim().length()); // Trim Delete Space
    }
}