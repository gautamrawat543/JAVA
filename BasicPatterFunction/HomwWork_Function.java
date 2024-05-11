import java.util.*;

public class HomwWork_Function {

    public static void checkEven(int number) {
        if (number % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static void printTable(int table) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " X " + i + " = " + (table * i));
        }
    }

    public static void checkPrime(int prime) {
        boolean isPrime = false;
        if (prime == 0 || prime == 1 || prime == 2) {
            System.out.println("number is a prime");
            return;
        } else {
            for (int i = 2; i < prime; i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                    // System.out.println("number is not a prime");
                } else {
                    isPrime = true;
                    // System.out.println("number is a prime");
                }
            }
            if (isPrime) {
                System.out.println("number is a prime");
            } else {
                System.out.println("number is not a prime");
            }
        }
    }

    public static void numberRaised(int number, int power) {
        int n = 1;
        for (int i = 1; i <= power; i++) {
            n = n * number;
        }
        System.out.println(number + " ^ " + power + " = " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter number to chech if even or not");
        // int number = sc.nextInt();
        // checkEven(number);
        // System.out.println("enter a number for table");
        // int table = sc.nextInt();
        // printTable(table);
        // System.out.println("enter a number to check for prime");
        // int prime = sc.nextInt();
        // checkPrime(prime);
        numberRaised(5, 3);
    }
}
