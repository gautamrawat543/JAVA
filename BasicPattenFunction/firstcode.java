import java.util.*;

class firstcode {
    // public static void main(String[] args) {
    // System.out.println("hello world");
    // System.out.print("hello gautam\n");
    // System.out.print("hello rawat");

    // }
    // public static void main(String[] args) {
    // for (int i = 1; i < 5; i++) {
    // for (int j = 1; j <= i; j++) {

    // System.out.print("* ");
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String[] args) {
    // String name = "gautam";
    // int age = 22;
    // int a = 10;
    // int b = 25;
    // double price = 25.55;
    // int sum = a + b;
    // int diff = b - a;
    // int mul = a * b;
    // // System.out.println(" " + b + " " + price);
    // System.out.println(sum);
    // System.out.println(sum);
    // System.out.println(mul);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter a name- ");
    // // String name = sc.next();
    // String fulname = sc.nextLine();
    // System.out.println("entered name is - " + fulname);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("sum is " + sum);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter your age");
    // int age = sc.nextInt();

    // if (age > 18) {
    // System.out.println("you adult");
    // } else {
    // System.out.println("not adult");
    // }

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number- ");
    // int num = sc.nextInt();
    // if (num % 2 == 0) {
    // System.out.println("even number");
    // } else {
    // System.out.println("odd number");
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter a");
    // int a = sc.nextInt();
    // System.out.println("enter b");
    // int b = sc.nextInt();
    // if (a > b) {
    // System.out.println("a is greater than b");
    // } else if (b > a) {
    // System.out.println("b is greater than a");
    // } else {
    // System.out.println("both are equal");
    // }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bounjor");
                break;

            default:
                System.out.println("enter only number 1 2 3");
                break;
        }
        sc.close();
    }

}