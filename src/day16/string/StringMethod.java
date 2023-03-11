package day16.string;

public class StringMethod {
    public static void main(String[] args) {
        String name = "MgMg";
        String name2 = "MgMg";
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());

        System.out.println("Mg Mg".getClass().getSimpleName());
        System.out.println("Mg Mg".getClass());
        System.out.println("Mg Mg".getClass().getName());
        System.out.println("Mg Mg".getClass().getTypeName());
        System.out.println("Mg Mg".toCharArray());
        System.out.println("Mg Mg".replace("M", "m")); // Replacement

        System.out.println("".isEmpty());
        System.out.println("Jason".isEmpty());

        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("Jason".isBlank());

        System.out.println("".length());
        System.out.println("Jason".length());

        System.out.println("Jason".charAt(0)); // Search Char
        System.out.println("Jason".charAt(1));

        System.out.println("Jason".indexOf("o")); // Search Index Number

        System.out.println("Jason".contains("Ja"));
        System.out.println("Jason".contains("An"));

        System.out.println("Mg Mg".startsWith("Mg") ? "Male" : "Female"); // Ternary Operator

        System.out.println("example@gmail.blah".endsWith("@gmail.com")); // Gmail
        System.out.println("example@gmail.com".endsWith("@gmail.com")); // Gmail

        System.out.println("M stand for Mg".lastIndexOf("M"));

        char names[] = new char[12];
        "Jason is a student".getChars(0, 6, names, 1);
        System.out.println(names);

        char chars[] = new char[12];
        "Jason is a student".getChars(0, 5, chars, 3);
        System.out.println(chars);
    }
}