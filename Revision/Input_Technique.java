package Revision;

import java.util.Scanner;

public class Input_Technique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close(); // Don't forget to close the scanner to release resources.
    }
}
