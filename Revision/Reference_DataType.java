package Revision;

public class Reference_DataType {
    public static void main(String[] args) {
        // String: Represents a sequence of characters, like "Hello, World!".
        String name = "Alice";
        System.out.println(name);

        // Array: Represents a collection of elements of the same type.
        int[] numb = { 45, 25, 3, 6, 87, 6, 4 };
        for (int num : numb) {
            System.out.println(num);
        }
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i] + " ");
        }
        System.out.println();
        for (int num : numb) { /*
                                * cant use this sout(num + '') because In Java, when you use the + operator
                                * between an integer and a character, the integer gets implicitly cast to a
                                * character code (ASCII value), leading to unexpected results.
                                */
            System.out.print(num + " ");
        }
    }
}