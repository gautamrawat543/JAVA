package YoutubeVideo;

public class Constants {
    public static void main(String[] args) {
        final int DAYS_IN_WEEK = 7; // name is capital because it is a constant/final
        // DAYS_IN_WEEK=8; //The final local variable DAYS_IN_WEEK cannot be assigned
        System.out.println(DAYS_IN_WEEK);

        int result = 9 * 5 / 3; // between multiple operators, the order is from left to right
        int result2 = 5 / 3 * 9; // between multiple operators, the order is from left to right
        System.out.println(result);
        System.out.println(result2);
    }

}
