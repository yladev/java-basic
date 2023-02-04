package day5.arrays.selfstudy;

public class GetAverageArrays {
    public static void main(String[] args) {
        int numbers[] = {20, 30, 25, -16, 60, -100};
        int sum = 0;

        for (int i = 0; i < numbers.length; i ++)
            sum = sum + numbers[i];

        double average = sum / numbers.length;
        System.out.println("Average value of the array elements => " + average);
    }
}
