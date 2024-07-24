package YoutubeVideo;

import java.text.NumberFormat;

public class NumberFormattor {
    public static void main(String[] args) {
        NumberFormat curency = NumberFormat.getCurrencyInstance();
        String result = curency.format(154561651.531894);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.531894);
        System.out.println(result2);

        System.out.println(NumberFormat.getPercentInstance().format(0.3)); // this is called method chaining
    }

}
