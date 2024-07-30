public class Advanced_Pattern {
    public static void main(String[] args) {
        int n = 4;

        // Butterfly
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int space = 2 * (n - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int space = 2 * (n - i);
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        n = 5;
        // Solid Rohmbus
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Number Pyramid
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {

        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {

        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // Pallindrome Triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {

        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {

        // System.out.print(j);
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);

        // }
        // System.out.println();
        // }

        n = 4;
        // Diamond easy
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Diamond Pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i); j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
