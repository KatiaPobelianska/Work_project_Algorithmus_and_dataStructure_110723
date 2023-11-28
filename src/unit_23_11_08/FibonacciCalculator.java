package unit_23_11_08;

public class FibonacciCalculator {
    public static void main(String[] args) {
        int n = 10;
        long result = calculateFibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }

//      O(2^n)
    public static long calculateFibonacci(int n) {
//        base condition if(f == 0) return 0 and if(f == 1) return 1
        if (n <= 1) return n; // Базовый случай: F(0) = 0, F(1) = 1
//        f(n) = f(n - 1) + f(n - 2)
        else return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
