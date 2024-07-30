public class GCD {

    public static void calculateGcd(int num1, int num2) {
        int gcd = 1;
        int tempnum;
        if (num1 > num2) {
            tempnum = num1;
        } else if (num1 < num2) {
            tempnum = num2;
        } else {
            tempnum = num1;
        }
        for (int i = 1; i <= tempnum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD  of " + num1 + " and " + num2 + " is " + gcd);
    }

    public static void printFibonacci(int n) {// 0 1 1 2 3 5 8 13 21 .....
        int number1 = 0;
        int number2 = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(number1 + " ");
            int sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }

    public static void swapNumberWithTemp(int a, int b) {
        System.out.println("\na is " + a + " b is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap \na is " + a + " b is " + b);
    }

    public static void swapNumberWithoutTemp(int a, int b) {
        System.out.println("\na is " + a + " b is " + b);
        a = b - a;
        b = b - a;
        a = b + a;
        System.out.println("After Swap \na is " + a + " b is " + b);
    }

    public static void main(String[] args) {
        calculateGcd(15, 225);
        printFibonacci(9);
        swapNumberWithTemp(225, 15);
        swapNumberWithoutTemp(225, 15);
    }
}
