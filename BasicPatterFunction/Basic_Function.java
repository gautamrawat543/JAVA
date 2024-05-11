import java.util.*;

public class Basic_Function {

    public static void printMyName(String myName) {
        System.out.println("your name is " + myName);
        return;
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateMultiply(int a, int b) {
        return a * b;
    }

    public static void calculateFactorial(int number) {
        int fact = 1;
        if (number < 0) {
            System.out.println("enter a positive number");
            return;
        } else if (number == 0) {
            System.out.println("factorial is 1");
            return;
        } else {
            for (int i = number; i >= 1; i--) {
                fact = (fact * i);
            }
            System.out.println("factorial is " + fact);
            return;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String myName = sc.next();
        printMyName(myName);

        System.out.println("enter 2 numbers for addtion");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("sum is " + sum);

        System.out.println("Multiply is " + calculateMultiply(a, b));

        System.out.println("enter number for factorial");
        int fact = sc.nextInt();
        calculateFactorial(fact);
    }
}
