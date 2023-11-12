package home_task_2023_11_10;

/*Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
Например:
sum(7, 2) = 2 + 4 + 6 = 12
sum(12, 3) = 3 + 6 + 9 + 12 = 30
Решить задачу:
б) через рекурсию*/
public class SumCalculatorRecursion {

    public static int sum(int n, int m) {
        if (n <= 0) {
            return 0; // Базовый случай: если n меньше или равно 0, возвращаем 0
        }

        // Проверяем, делится ли n на m
        int currentTerm = (n % m == 0) ? n : 0;

        // Рекурсивно вызываем sum для n-1 и добавляем текущее значение
        return currentTerm + sum(n - 1, m);
    }


    public static void main(String[] args) {
        System.out.println("Sum (7,2) " + sum(7, 2));//
        System.out.println("Sum (12,3) " + sum(12, 3));//
    }
}
