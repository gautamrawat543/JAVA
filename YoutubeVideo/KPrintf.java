package YoutubeVideo;

public class KPrintf {

    public static void main(String[] args) {

        // printf() = an optional method to control, format, and display text to the
        // console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character] % is the format specifier
        System.out.printf("%b", myBoolean); // %b is for boolean
        System.out.println();

        System.out.printf("%c", myChar); // %c is for character
        System.out.println();

        System.out.printf("%s", myString); // %s is for string
        System.out.println();

        System.out.printf("%d", myInt); // %d is for integer
        System.out.println();

        System.out.printf("%f", myDouble); // %f is for float and double
        System.out.println();

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString); // adds 10 spaces before myString
        System.out.println();

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.1f", myDouble); // shows only 1 decimal
        System.out.println();

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %,f", myDouble); // adds commas for thousands
        System.out.println();
        System.out.printf("You have this much money %,.2f", myDouble); // adds commas and 2 decimal
    }

}
