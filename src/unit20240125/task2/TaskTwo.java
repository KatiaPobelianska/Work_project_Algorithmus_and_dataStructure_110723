package unit20240125.task2;
/*Имеется отсортированный массив строк, в котором могут присутствовать
пустые строки. Напишите метод для определения позиции заданной строки.
Пример:
Ввод: строка "ball" в массиве {"at", "", "", "", "ball" , "", "" ," car" , '"', "",
"dad", ,, .., ""}
Вывод: 4
*/
public class TaskTwo {

    public static int search(String[] array, String target) {
        if (array == null || array.length == 0 || target == null) {
            return -1;  // Если входные данные некорректны
        }

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // Пропускаем пустые строки справа
            while (left <= right && array[right].isEmpty()) {
                right--;
            }

            int mid = left + (right - left) / 2;

            // Пропускаем пустые строки в середине
            while (array[mid].isEmpty() && mid < right) {
                mid++;
            }

            int comparison = target.compareTo(array[mid]);

            if (comparison == 0) {
                return mid;  // Найдена позиция строки
            } else if (comparison < 0) {
                right = mid - 1;  // Искать в левой половине
            } else {
                left = mid + 1;   // Искать в правой половине
            }
        }

        return -1;  // Строка не найдена
    }

    public static void main(String[] args) {
        String[] array = {"at", "", "", "", "ball", "", "", "car", "", "dad", "", ""};
        String target = "ball";
        int result = search(array, target);

        if (result != -1) {
            System.out.println("Строка '" + target + "' найдена на позиции " + result);
        } else {
            System.out.println("Строка '" + target + "' не найдена");
        }
    }
}
