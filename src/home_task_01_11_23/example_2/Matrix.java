package home_task_01_11_23.example_2;

import java.util.Random;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size) {
        matrix = new int[size][size];
    }

    public void fillRandom() {
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = r.nextInt();
            }
        }
    }

    public void printMatrix() {
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.println(el + "\t");
            }
        }
        System.out.println();
    }

    public void increaseMatrix() {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                matrix[i][j]++;
            }
        }
    }
}
