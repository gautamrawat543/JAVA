package YoutubeVideo;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = 10; // this is implicit typecasting or it is done automatically
        // byte -> short -> int -> long -> float -> double
        // implicit typecasting happens when there is no chance in data loss
        int b = a + 4;
        System.out.println(b);

        double x = 1.1;
        int y = (int) x + 2; // this is explicit typecasting
        System.out.println(y);

        // typecasting only happens when the data is compatible
        // to convert string to int
        String num = "10";
        int z = Integer.parseInt(num) + 5; // parse the string to int
        System.out.println(z);

        // Math
        System.out.println(Math.round(1.4F));
        int result = (int) Math.ceil(1.4F);
        System.out.println(result);
        System.out.println(Math.floor(1.8F));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.random());
        System.out.println(Math.random() * 100);
        System.out.println(Math.round(Math.random() * 100));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.round(23.5));
        System.out.println(Math.round(23.4));

    }

}
