package unit_23_11_08;

public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 3;
        long result = calculateFactorial(n);
        System.out.println(n + " ! " + result);
    }
//      O(n)
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return (long) n * calculateFactorial(n - 1);
        }
    }
}
