package day5.array;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        String ar[] = {"Yan", "Linn", "Aung", "Jason", "Andrew"};
        System.out.println(ar[2]);
        System.out.println(Arrays.toString(ar)); // initialization

        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a.length);
        System.out.println(Arrays.toString(a)); // declaration

        int b[] = {1, 2, 3, 4, 5};
        b[0] = 6;
        b[1] = 7;
        b[2] = 8;
        b[3] = 9;
        b[4] = 10;
        System.out.println(Arrays.toString(b)); // Change Array

        // multidimensional array with initialization
        int c[][] = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {110, 120, 130, 140, 150},
                {160, 170, 180, 190, 200},
                {210, 220, 230, 240, 250},
        };
        System.out.println(c[0][1]);

        // multidimensional array with declaration
        int d[][] = new int[2][2];


        // array with loop
        int num[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < num.length; i ++) {
            System.out.println(num[i]);
        }

        int num1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int number = num1.length-1; number >= 0; number --) {
            System.out.print(num1[number]);
        }
        System.out.println();

        // array with for each
        int num2[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i : num2) {
            System.out.println(i);
        }
    }
}
