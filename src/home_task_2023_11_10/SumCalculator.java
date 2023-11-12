package home_task_2023_11_10;

/*Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
Например:
sum(7, 2) = 2 + 4 + 6 = 12
sum(12, 3) = 3 + 6 + 9 + 12 = 30
Решить задачу:
а) через цикл*/
public class SumCalculator {
    public static int sum(int n, int m) {
        int result = 0;
        for (int i = m; i <= n; i += m) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum (7,2): " + sum(7, 2));//2+4+6=12
        System.out.println("Sum (12,3): " + sum(12, 3));//3+6+9+12=30
    }
}
