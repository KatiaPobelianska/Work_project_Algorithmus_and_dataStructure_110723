package home_task_01_11_23;

/*for (int i = 0; i < n; ++i) {
  for (int j = 0; j < n/3; ++j) {
    matrix[i][i]++;
  } - O(n*n/3)=> O(n^2)
}*/
public class Example5 {
    public static void main(String[] args) {
        int n = 27;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 3; ++j) {
                matrix[i][j]++;
            }
        }

    }
}
