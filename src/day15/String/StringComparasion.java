package day15.String;

public class StringComparasion {
    public static void main(String[] args) {
        String a = "Andrew";
        String b = "andrew";
        System.out.println(b.equals(a));
        System.out.println(b == a);
        System.out.println(b.compareTo(a)); // ASCII Code

        System.out.println("ab".compareTo("bc"));
        System.out.println("y".compareTo(a));

        System.out.println("Code".equalsIgnoreCase("code"));

        // String Pull
        String name = "Mg Mg";
        String name1 = "Mg Mg";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        // CompareIgnore Case
        System.out.println("Jason".compareToIgnoreCase("jason"));
    }
}