package Revision;

public class Iterative_Loops {
    // Iterative statements are used to execute a block of code repeatedly.

    public static void forLoop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count For: " + i);
        }
    }

    public static void forEach() {
        int[] numbers = { 10, 12, 4, 36, 9, 5 };

        for (int num : numbers) {
            System.out.println("Count For Each: " + num);
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 5) {
            System.out.println("Count While: " + i);
            i++;
        }
    }

    public static void doWhileLoop() {
        int j = 1;
        do {
            System.out.println("Count Do While: " + j);
            j++;
        } while (j <= 5);
    }

    public static void main(String[] args) {
        forLoop();
        forEach();
        whileLoop();
        doWhileLoop();
    }
}
