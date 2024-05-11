public class Pattern {

    // solid rectangle
    // public static void main(String[] args) {
    // for (int i = 1; i <= 4; i++) {
    // for (int j = 1; j <= 5; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // Hollow rectangle
    // public static void main(String[] args) {
    // int m = 4;
    // int n = 5;
    // for (int i = 1; i <= m; i++) {
    // for (int j = 1; j <= n; j++) {
    // if (i == 1 || j == 1 || i == m || j == n) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // Half Pyramid
    // public static void main(String[] args) {
    // for (int i = 1; i <= 4; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // Inverted Half Pyramid
    // public static void main(String[] args) {
    // for (int i = 4; i >= 1; i--) {
    // for (int j = i; j >= 1; j--) {
    // System.out.print("* ");
    // }
    // // for (int j = 1; j <= i; j++) {
    // // System.out.print("* ");
    // // }
    // System.out.println();
    // }
    // }

    // Inverted Half Pyramid (180 rotate)
    // public static void main(String[] args) {
    // for (int i = 1; i <= 4; i++) {
    // for (int j = 1; j <= 4 - i; j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // Half Pyramid number
    // public static void main(String[] args) {
    // for (int i = 1; i <= 4; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // Inverted Half Pyramid number
    // public static void main(String[] args) {
    // for (int i = 4; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }
    // }

    // Floyd's Triangle
    // public static void main(String[] args) {
    // int sum = 0;
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= i; j++) {
    // sum++;
    // System.out.print(sum + " ");
    // }
    // System.out.println();
    // }
    // }

    // 0 - 1 Triangle
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {

                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
