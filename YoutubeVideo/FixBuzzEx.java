package YoutubeVideo;

import java.util.Scanner;

public class FixBuzzEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        short number = sc.nextShort();
        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
        sc.close();
    }

}
