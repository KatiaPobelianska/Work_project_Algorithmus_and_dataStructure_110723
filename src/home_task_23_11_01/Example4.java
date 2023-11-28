package home_task_23_11_01;

import java.util.Random;

/*for (int i = 0; i < 1000; ++i) {
  for (int j = 1; j < n; ++j) {
    ++count;
  } - это линейная сложность O(n)
  Независимо от конкретного значения n, сложность остается O(n),
  так как внешний цикл выполняется фиксированное количество раз (1000),
  а количество итераций внутреннего цикла зависит от n
}*/
public class Example4 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(1000) + 1;
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < n; j++) {
                ++count;
            }
        }
        System.out.println("n: " + n);
        System.out.println("count: " + count);
    }
}
