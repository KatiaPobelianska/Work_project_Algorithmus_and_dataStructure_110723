package home_task_23_11_01;
/*
* ОТВЕТ:
*
for (int i = 0; i < n; ++i) {
  for (int j = 1; j < m; ++j) {
    a[i][j]++;
  }
  * здесь количество итераций остается постоянным относительно количества строк
  * Этот код имеет линейную сложность O(n * (m-1)), где n - количество строк,
  * а m - количество столбцов. В этом случае, внешний цикл выполняется n раз,
  *  и внутренний цикл выполняется (m-1) раз,
  * что делает общее количество операций равным O(n * (m-1)).
}*/


public class Example1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        increaseMatrixElements(matrix);

        System.out.println("\nМатрица после увеличения элементов на 1:");
        printMatrix(matrix);
    }

    public static void increaseMatrixElements(int[][] matrix) {
        int n = matrix.length; // Количество строк
        int m = matrix[0].length; // Количество столбцов

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j]++;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

