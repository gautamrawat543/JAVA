package Revision;

public class Logical_Operators {
    // Logical operators are used to perform logical operations on boolean
    // expressions. Here are the common logical operators:

    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;

        // AND (&&): Returns true if both operands are true.
        System.out.println(isSunny && isWarm); // Outputs: false

        // OR (||): Returns true if at least one of the operands is true.
        System.out.println(isSunny || isWarm); // Outputs: true

        // NOT (!): Returns the opposite of the operand's boolean value.
        System.out.println(!isSunny); // Outputs: false
    }
}
