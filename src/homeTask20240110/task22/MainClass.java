package homeTask20240110.task22;

import java.util.HashMap;

/*Task 2. Проверьте, равны ли два массива или нет
Учитывая два массива, arr1 и arr2 одинаковой длины N, задача состоит в том, чтобы определить, равны ли данные массивы или нет.


Два массива называются равными, если:
оба они содержат один и тот же набор элементов, расположение (или перестановки) элементов может/не может быть одинаковым.
Если есть повторения, то количество повторяющихся элементов также должно быть одинаковым, чтобы два массива были равны.
Ввод: arr1[] = {1, 2, 5, 4, 0, 0}, arr2[] = {0, 2, 4, 5, 0, 1}
Вывод: Да
Неоптимальное решение задачи написано на занятии (см. CompareArrays.java).
Необходимо предложить решение сложности O(n).*/
public class MainClass {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0, 0};
        int[] arr2 = {0, 2, 4, 5, 0, 1};

        if (areArraysEqual(arr1, arr2)) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массивы не равны");
        }
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int num : arr2) {
            if (!countMap.containsKey(num)) {
                return false;
            }
            countMap.put(num, countMap.get(num) - 1);
            if (countMap.get(num) == 0) {
                countMap.remove(num);
            }
        }
        return countMap.isEmpty();
    }
}
