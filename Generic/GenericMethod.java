package Generic;

public class GenericMethod {

    /*
     * Generics- enables types(classes,interfaces) to be parameterized when
     * defining- classes,interfaces , methods
     * A benefit is to eliminate the need to create multiple versions of methods and
     * classes for various datatypes
     * You can use 1 version for all reference data types
     * 
     */

    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "one", "two", "three", "four", "five" };
        Character[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        // making different arrays for different data types works but we can use a
        // different approach of using generic methods
        printArray(intArray);
        System.out.println();
        printArray(stringArray);
        System.out.println();
        printArray(charArray);
        System.out.println();
        printArray(doubleArray);

        System.out.println("");

        // using generic method - you can see i created only one method that can be used
        // for all data types
        displayArray(intArray);
        System.out.println();
        displayArray(stringArray);
        System.out.println();
        displayArray(charArray);
        System.out.println();
        displayArray(doubleArray);

        System.out.println("");

        // using generic method - this example is of using return type
        System.out.println(displayFirstElement(intArray));
        System.out.println(displayFirstElement(stringArray));
        System.out.println(displayFirstElement(charArray));
        System.out.println(displayFirstElement(doubleArray));
    }

    public static void printArray(Integer[] array) {
        for (Integer arr : array) {
            System.out.print(arr);
        }
    }

    public static void printArray(String[] array) {
        for (String arr : array) {
            System.out.print(arr);
        }
    }

    public static void printArray(Character[] array) {
        for (Character arr : array) {
            System.out.print(arr);
        }
    }

    public static void printArray(Double[] array) {
        for (Double arr : array) {
            System.out.print(arr);
        }
    }

    public static <T> void displayArray(T[] array) {

        for (T arr : array) {
            System.out.print(arr + " ");
        }
    }

    public static <T> T displayFirstElement(T[] array) {
        return array[0];
    }

}
