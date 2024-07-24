package YoutubeVideo;

import javax.swing.JOptionPane;

import java.text.NumberFormat;
import java.util.Scanner;

public class GuiMortageCal {
    public static void main(String[] args) {

        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        Scanner sc = new Scanner(System.in);

        float principal = 0;
        while (true) {
            principal = Float.parseFloat(JOptionPane.showInputDialog("Enter Principal  ($10k - $1M): "));
            if (principal >= 10000 && principal <= 1000000) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Enter Principal between 10000 and 1000000");
        }

        float monthRate = 0;
        while (true) {
            float annualRate = Float.parseFloat(JOptionPane.showInputDialog("Annual Rate of Interest: "));

            if (annualRate > 0 && annualRate <= 30) {
                monthRate = annualRate / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            JOptionPane.showMessageDialog(null, "Enter Annual Rate more than 0 and less than equal to 30");
        }

        int periodMonth = 0;
        while (true) {
            int periodYear = Integer.parseInt(JOptionPane.showInputDialog("Period (Years): "));
            if (periodYear > 0 && periodYear <= 30) {
                periodMonth = periodYear * 12;
                break;
            }
            JOptionPane.showMessageDialog(null, "Enter Annual year between 1 and 30");

        }
        sc.close();

        double ratePlusOne = Math.pow((1 + monthRate), periodMonth);
        double mortageAmount = principal * ((monthRate * ratePlusOne) / (ratePlusOne - 1));
        String formatMortageAmount = NumberFormat.getCurrencyInstance().format(mortageAmount);
        JOptionPane.showMessageDialog(null, "Mortage Amount: " + formatMortageAmount);
    }

}
