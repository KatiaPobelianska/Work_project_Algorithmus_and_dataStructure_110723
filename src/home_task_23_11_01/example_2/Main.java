package home_task_23_11_01.example_2;
/*for (int i = 0; i < n-1; ++i) {
  for (int j = 0; j < n-i; ++j) {
    a[i][j]++;
  }
  этот пример (здесь два цикла) представляет собой квадратичную сложность O(n^2).
}*/
public class Main {
    public static void main(String[] args) {
        int n = 4;
        Matrix a = new Matrix(n);

        System.out.println("Исходная матрица: ");
        a.fillRandom();
        a.printMatrix();

        System.out.println("Обновленная матрица: ");
        a.increaseMatrix();
        a.printMatrix();
    }
}
