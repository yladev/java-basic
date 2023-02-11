package day6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.println("Enter a number.");

        int a = j.nextInt();
        System.out.println("this is a" + a);

        String b = j.next();
        System.out.println("this is b" + b);

        int number[] = new int[5];
        System.out.println("Enter the index number");
        System.out.println(Arrays.toString(number));

        int arrayNumber = j.nextInt();
        int numberOne[] = new int[arrayNumber];
        System.out.println("Enter the array number:");
        for (int i = 0; i < numberOne.length; i ++) {
            int data = j.nextInt();
            numberOne[i] = data;
        }
        System.out.println(Arrays.toString(numberOne));
    }

}
