package Revision;

public class Conditional_Ternary {

    public static void conditionalStatement() {
        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a child.");
        }
    }

    public static void ternaryStatement() {
        int num = 10;
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(result); // Outputs: even
    }

    public static void main(String[] args) {
        // Conditional statements are used to execute different blocks of code based on
        // certain conditions.
        conditionalStatement();

        // The ternary operator is a shorthand way of writing if-else statements.
        ternaryStatement();

    }
}
