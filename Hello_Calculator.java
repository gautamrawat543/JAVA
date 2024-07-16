import java.util.Scanner;

public class Hello_Calculator {

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        int cont;

        do {
            System.out.println("Please enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter the second number:");
            double num2 = scanner.nextDouble();

            System.out.println("Select operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    scanner.close();
                    return;
            }

            System.out.println("Result: " + result);
            System.out.println("Want to continue?\nEnter 1 to continue, 0 to exit:");
            cont = scanner.nextInt();

        } while (cont == 1);

        scanner.close();
    }

    public static void main(String[] args) {
        calculator();
    }
}