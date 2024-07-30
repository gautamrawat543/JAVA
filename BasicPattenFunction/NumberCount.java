import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;
        // char choice;
        String choice;
        do {
            System.out.println("enter a numer");
            int number = sc.nextInt();
            if (number > 0) {
                positiveNumber++;
            } else if (number < 0) {
                negativeNumber++;
            } else {
                zeroNumber++;
            }
            System.out.println("Do you want to continue (y/n)");
            choice = sc.next();
        } while (choice.equals("yes") || choice.equals("YES") || choice.equals("y") || choice.equals("Y"));
        System.out.println("Positive number entered - " + positiveNumber);
        System.out.println("Negative number entered - " + negativeNumber);
        System.out.println("Zero number entered - " + zeroNumber);
        sc.close();
    }
}
