package hometask20240124;

import java.util.Arrays;

public class InsertionSorter {
    public static void main(String[] args) {
        int[] numbers = {8, 56, 1, 5, 69, 96, 44, 35, 1};
        System.out.println(Arrays.toString(numbers));
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
