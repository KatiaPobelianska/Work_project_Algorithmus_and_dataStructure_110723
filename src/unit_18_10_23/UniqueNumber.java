package unit_18_10_23;

//Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим), а один элемент появляется только один раз.
//Написать метод для нахождения этого элемента.
//Решить задачу
//1*через простой цикл
//2*. через адаптацию алгоритма бинарного поиска
public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 7, 5, 5};
        int result = findUniqueNumber(arr);
        System.out.println("Искомый элемент: findUniqueNumber() " + result);

        int result1 = searchBinary(arr);
        System.out.println("Искомый элемент: searchBinary() " + result1);
    }

    public static int findUniqueNumber(int[] data) {
        for (int i = 0; i < data.length; i += 2) {
            if (i == data.length - 1 || data[i] != data[i + 1]) {
                return data[i];
            }
        }
        // Если цикл завершился, значит уникальный элемент находится в конце массива
        return data[data.length - 1];
    }

    public static int searchBinary(int[] data) {
        int start = 0;
        int end = data.length - 1;
        int middle;

        while (start < end) {
            middle = start + (end - start) / 2;
            // Проверяем, на какой стороне от mid находится уникальный элемент
            if (middle % 2 == 1) {
                middle--; // Делаем middle четным
            }
            // Если элементы равны, смещаем start, иначе - смещаем end
            if (data[middle] == data[middle + 1]) {
                start = middle + 2;
            } else {
                end = middle;
            }
        }
        // В конце цикла start и finish сойдутся, и start будет указывать на уникальный элемент
        return data[start];
    }
}
