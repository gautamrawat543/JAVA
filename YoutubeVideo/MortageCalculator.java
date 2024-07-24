// package YoutubeVideo;

// import java.text.NumberFormat;
// import java.util.Scanner;

// public class MortageCalculator {

//     public static void main(String[] args) {
//         final byte PERCENT = 100;
//         final byte MONTHS_IN_YEAR = 12;
//         Scanner sc = new Scanner(System.in);

//         float principal = 0;
//         while (principal < 10001 || principal > 1000000) {
//             System.out.print("Enter Principal  ($10k - $1M): ");
//             principal = sc.nextFloat();
//             if (principal > 10000 && principal <= 1000000) {
//                 float annualRate = 0;
//                 while (annualRate < 1 || annualRate > 30) {
//                     System.out.print("Annual Rate of Interest: ");
//                     annualRate = sc.nextFloat();
//                     if (annualRate > 0 && annualRate <= 30) {

//                         final float monthRate = annualRate / PERCENT / MONTHS_IN_YEAR;

//                         int periodYear = 0;
//                         while (periodYear < 1 || periodYear > 30) {
//                             System.out.print("Period (Years): ");
//                             periodYear = sc.nextInt();
//                             if (periodYear > 0 && periodYear <= 30) {
//                                 int periodMonth = periodYear * 12;
// double ratePlusOne = Math.pow((1 + monthRate), periodMonth);
// double mortageAmount = principal * ((monthRate * ratePlusOne) / (ratePlusOne - 1));
// String formatMortageAmount = NumberFormat.getCurrencyInstance().format(mortageAmount);
// System.out.println("Mortage Amount: " + formatMortageAmount);
//                             } else {
//                                 System.out.println("Enter Annual year between 1 and 30");                               
//                                 continue;
//                             }
//                         }

//                     } else {
//                         System.out.println("Enter Annual Rate more than 0 and less than equal to 30");
//                         continue;
//                     }
//                 }

//             } else {
//                 System.out.println("Enter Principal more than 10000 and 1000000");
//                 continue;
//             }
//         }

//     }

// }

package YoutubeVideo;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {

    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        Scanner sc = new Scanner(System.in);

        float principal = 0;
        while (true) {
            System.out.print("Enter Principal  ($10k - $1M): ");
            principal = sc.nextFloat();
            if (principal >= 10000 && principal <= 1000000) {
                break;
            }
            System.out.println("Enter Principal between 10000 and 1000000");
        }

        float monthRate = 0;
        while (true) {
            System.out.print("Annual Rate of Interest: ");
            float annualRate = sc.nextFloat();
            if (annualRate > 0 && annualRate <= 30) {
                monthRate = annualRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter Annual Rate more than 0 and less than equal to 30");
        }

        int periodMonth = 0;
        while (true) {
            System.out.print("Period (Years): ");
            int periodYear = sc.nextInt();
            if (periodYear > 0 && periodYear <= 30) {
                periodMonth = periodYear * 12;
                break;
            }
            System.out.println("Enter Annual year between 1 and 30");
        }
        sc.close();

        double ratePlusOne = Math.pow((1 + monthRate), periodMonth);
        double mortageAmount = principal * ((monthRate * ratePlusOne) / (ratePlusOne - 1));
        String formatMortageAmount = NumberFormat.getCurrencyInstance().format(mortageAmount);
        System.out.println("Mortage Amount: " + formatMortageAmount);
    }

}
