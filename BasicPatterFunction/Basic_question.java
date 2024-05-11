public class Basic_question {

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void printSumOfOddNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static int greaterNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double circumference(int radii) {
        return 2 * 3.14 * radii;
    }

    public static void main(String[] args) {
        System.out.println(average(2, 4, 3));
        printSumOfOddNumber(10);
        System.out.println(greaterNumber(4, 2));
        System.out.println(circumference(3));

        int doWhileLooop = 3;
        do {
            System.out.println("radii is correct " + doWhileLooop);
        } while (doWhileLooop == 4);
    }
}
