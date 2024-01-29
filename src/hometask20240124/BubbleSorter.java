package hometask20240124;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] numbers = {11, 20, 65, 9, 45, 3};
        System.out.println(Arrays.toString(numbers));
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));



    }
}
