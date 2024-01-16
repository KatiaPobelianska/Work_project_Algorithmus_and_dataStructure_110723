package homeTask20240110.task21;
/*Task 2. Проверьте, равны ли два массива или нет
Учитывая два массива, arr1 и arr2 одинаковой длины N, задача состоит в том, чтобы определить,
 равны ли данные массивы или нет.
*/
public class MainClass {
    public static void main(String[] args) {
        int [] arrayOne = {1,2,3,4,5};
        int [] arrayTwo = {5,4,3,2,1};

        if (areArraysEqual(arrayOne, arrayTwo)){
            System.out.println("Массивы равны");
        }else {
            System.out.println("Массивы не равны");
        }

    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2){
        if(arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
