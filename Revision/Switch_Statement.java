package Revision;

import java.util.Scanner;

public class Switch_Statement {
    // Switch statements allow us to execute different blocks of code based on the
    // value of a variable.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter the day number: ");
            int day = sc.nextInt();
            String dayName;
    
            switch (day) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day";
            }
    
            System.out.println("Today is " + dayName);
            System.out.println("Enter 1 to continue or 0 to exit: ");
            choice = sc.nextInt();
        }while(choice!=0);
       
    }
}
