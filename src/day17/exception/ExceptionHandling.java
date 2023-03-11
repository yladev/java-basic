package day17.exception;

import java.io.PrintStream;
import java.util.Scanner;

public class ExceptionHandling {
    // try
    // catch
    // finally
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            try {
                int result = a / b;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                int[] arr = {0, 1, 2};
                System.out.println(arr[3]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            Scanner scanner = new Scanner(System.in);
            int in = scanner.nextInt();
            System.out.println(in);git
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int[] arr = {0, 1, 2};
        System.out.println(arr[3]); // ArrayIndexOutOfBounds Exception

        String c = null;
        System.out.println(c.length()); // NullPointer Exception

        System.out.println(Integer.parseInt("mg mg")); // InputMisMatch Exception
    }
}