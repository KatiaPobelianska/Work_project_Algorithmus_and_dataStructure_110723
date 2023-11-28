package unit_23_11_08;

public class Recursion {
    public static void main(String[] args) {
        counter(4);
    }

    public static void counter(int n) {
        if (n == 0) return;
        System.out.println(n);
        counter(n - 1);
    }
}
