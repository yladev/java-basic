package day5.arrays.selfstudy;

public class SumOfArrays {
    public static void main(String[] args) {
        int myArrays[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i: myArrays) {
            sum += i;
        }

        System.out.println(sum);
    }
}
