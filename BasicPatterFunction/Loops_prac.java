import java.util.*;

public class Loops_prac {
    // public static void main(String[] args) {

    // for (int i = 1; i <= 10; i++) {
    // System.out.println("hello world " + i);
    // }
    // }
    // public static void main(String[] args) {
    // int i = 1;
    // while (i < 11) {
    // System.out.println("while loop " + i);
    // i++;
    // }
    // }
    // public static void main(String[] args) {
    // int i = 1;
    // do {
    // System.out.println("do while " + i);
    // i++;
    // } while (i < 11);
    // }

    // public static void main(String[] args) {
    // int n = 4;
    // int sum = 0;
    // for (int i = 0; i <= n; i++) {
    // sum = sum + i;
    // System.out.print(sum + " ");
    // }
    // System.out.print("\n" + sum);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("input table number");
    // int num = sc.nextInt();
    // for (int i = 1; i < 11; i++) {
    // System.out.println(num + " * " + i + " = " + num * i);
    // }
    // }

    public static void main(String[] args) {
        // number swapping with 2 variables
        int a = 5;
        int b = 3;
        System.out.println(a + " " + b);
        a = a - b;
        System.out.println(a);
        b = b + a;
        System.out.println(b);
        a = b - a;
        System.out.println(a + " " + b);

        // number swapping with 3 variables
        int m = 5;
        int n = 8;
        System.out.println(m + " " + n);
        int z = m;
        m = n;
        n = z;
        System.out.println(m + " " + n);

    }

}
