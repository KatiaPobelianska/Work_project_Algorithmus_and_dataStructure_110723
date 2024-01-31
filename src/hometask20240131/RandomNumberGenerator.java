package hometask20240131;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        System.out.println(random7());
        System.out.println(random7());
        System.out.println(random7());
        System.out.println(random7());
        System.out.println(random7());
    }

    public static int random5() { // 0 1 2 3 4
        Random random = new Random();
        return random.nextInt(5);
    }

    public static int random7() { // 0 1 2 3 4 5 6

        int newRandom;
        do {
            newRandom = 5 * random5() + random5();  // 0 -- 24
        } while (newRandom >= 21);
        newRandom = newRandom % 7;
        return newRandom;
    }
}
