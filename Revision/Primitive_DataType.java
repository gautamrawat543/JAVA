package Revision;

public class Primitive_DataType {
    public static void main(String[] args) {
        // byte: Represents a 1 byte whole number in the range [-128, 127].
        byte age = 25;
        System.out.println(age);

        // short: Represents a 2 bytes whole number in the range [-32,768, 32,767].
        short population = 32000;
        System.out.println(population);

        // int: Represents a 4 bytes whole number in a wide range.
        int distance = 150000;
        System.out.println(distance);

        // long: Represents an 8 bytes whole number in a very wide range.
        long globalPopulation = 7760000000L; // Note the 'L' suffix for long literals
        System.out.println(globalPopulation);

        // float: Represents a 4 bytes floating-point number, suitable for approximate
        // representations of real numbers.
        float temperature = 20.5f; // Note the 'f' suffix for float literals
        System.out.println(temperature);

        // double: Represents an 8 bytes floating-point number, providing higher
        // precision compared to float.
        double height = 5.9;
        System.out.println(height);

        // boolean: Represents true or false values. 1 byte
        boolean isSunny = true;
        System.out.println(isSunny);

        // char: Represents single characters like 'A', 'b', '%'. 2 bytes
        char grade = 'A';
        System.out.println(grade);
    }
}
