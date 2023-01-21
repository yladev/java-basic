package day5.array;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {
        // one dimensional array with initialization
        String Name1[] = {"Andrew", "Victor", "May", "San"};
        System.out.println(Arrays.toString(Name1));

        // one dimensional array with declaration
        String Name3[] = new String[4];
        Name3[0] = "Andrew";
        Name3[1] = "Victor";
        Name3[2] = "May";
        Name3[3] = "San";
        System.out.println(Name3[0]);

        // multidimensional array with initialization
        String Name2[][] = {
                {"Andrew"},
                {"Victor"},
                {"May"},
                {"San"}
        };
        System.out.println(Name2[2][0]);

        // multidimensional array with declaration
        String Name4[][] = new String[3][3];
        Name4[0][0] = "Andrew";
        Name4[1][0] = "Victor";
        Name4[2][0] = "May";
        System.out.println(Name4[1][0]);

        // one dimensional array with initialization
        int Num1[] = {59, 50, 20, 17};
        System.out.println(Arrays.toString(Num1));

        // one dimensional array with declaration
        int Num3[] = new int[4];
        Num3[0] = 59;
        Num3[1] = 50;
        Num3[2] = 17;
        Num3[3] = 20;
        System.out.println(Num3[1]);

        // multidimensional array with initialization
        int Num2[][] = {
                {59},
                {50},
                {20},
                {17}
        };
        System.out.println(Num2[0][0]);

        // multidimensional array with declaration
        int Num4[][] = new int[4][4];
        Num4[0][0] = 59;
        Num4[1][0] = 50;
        Num4[2][0] = 20;
        Num4[3][0] = 17;
        System.out.println(Num4[3][0]);


        // Multidimensional Array
        int victor[][] = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {110, 120, 130, 140, 150},
                {160, 170, 180, 190, 200},
                {210, 220, 230, 240, 250},
        };
        for (int i = 0; i < victor.length; i++){
            for(int j = 0; j < victor.length; j++){
                System.out.println("Output ->" + victor[i][j]);
            }
        }

        // MultiDimensional Array (Test with String)
        String names[][] = {
                {"thuta", "yan", "zaw", "moe"},
                {"kaungkaung", "poe", "naing", "ei"},
                {"soe", "yin", "sweet", "mag"},
                {"yamin", "mahay thi", "daywi", "mama"}
        };

        for(int x = 0; x < names.length; x++){
            for(int y = 0; y < names.length; y++){
                System.out.println("output => " + names[x][y]);
            }
        }



    }
}
