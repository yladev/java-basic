package day6;

public class LargestNumberArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 7, 9, 4, 6};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > j) {
                j = a[i];
            }
        }
        System.out.println("Largest number in arrays is =>" + j);
    }
}
