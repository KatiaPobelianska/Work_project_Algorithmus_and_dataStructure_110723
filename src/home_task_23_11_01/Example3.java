package home_task_23_11_01;

/*for (int i = 0; i < n; ++i) {
  for (int j = 1; j < n; j *= 3) {
    a[i][j]++;
  } - O(n log n) - в этом конкретном случае сложность будет логарифмической
}*/
public class Example3 {
    public static void main(String[] args) {
//        В этом случае, внутренний цикл будет выполняться следующим образом:
//
//Первая итерация: j = 1
//Вторая итерация: j = 3
//Третья итерация: j = 9
//Четвертая итерация: j = 27
        int n = 27;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n; j *= 3) {
                a[i][j]++;
            }
        }
    }
}
