package YoutubeVideo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHand {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter a whole number to divide");
            int a = sc.nextInt();
            System.out.println("enter a whole number to divide by");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero " + e);
        } catch (InputMismatchException e) {
            System.out.println("invalid input . enter whole number only " + e);
        } catch (Exception e) {
            System.out.println("something went wrong " + e);
        } finally {
            System.out.println("this is final block it will always execute exception or not");
            sc.close();
        }

    }

}
