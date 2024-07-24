package YoutubeVideo;

import java.util.Date;

public class DataType {

    public static void main(String[] args) {
        byte a = 22; // this is a primitive datatype this does not need to allocate memory
        System.out.println(a);

        Date newDate = new Date(); // this is reference type datatype which need to allocate memory
        System.out.println(newDate);

        /*
         * primitive datatype are directly stored in the memory with there value
         * reference type datatype are stored in the memory but they point to the
         * adrress of the value
         */

        String name = "gautam";
        /*
         * string is a reference type but it is used frequently so it can be initialized
         * as a primitive type
         */
        System.out.println(name);
        name = name + " rawat";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.endsWith("wat"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('u'));
        System.err.println(name.replace('a', 'p'));
        System.out.println(name.toUpperCase()); // u will see the above code doesnt change the main string because in
                                                // java strings are immutable

        System.out.println("hello \"gautam\""); // backslash to escape
        System.out.println("C:\\Windows\\Users\\HP\\..\\");
        System.out.println("hello \ngautam");
        System.out.println("gautam\trawat"); // to add tab space

    }

}
