package unit_23_11_08;

public class TurnHanoe {
    public static void main(String[] args) {

        honoiRecursive(10, 'a', 'b', 'c');

    }

    public static void honoiRecursive(int n, char start, char middle, char end) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + start + " to " + end); // base condition
            return;
        }
        honoiRecursive(n - 1, start, end, middle);
        System.out.println("Move disk " + n + " from " + start + " to " + end);
        honoiRecursive(n - 1, middle, start, end);
    }
}
