package YoutubeVideo;

public class Arrays {
    public static void main(String[] args) {
        // initialize array
        int[] numbers = new int[5]; // number inside bracket is the length of the array
        numbers[0] = 10;
        numbers[1] = 20;
        System.out.println(numbers);
        System.out.println(java.util.Arrays.toString(numbers));

        // initialize array with values
        int[] numbers2 = { 40, 20, 10, 50, 30 };
        System.out.println(numbers2.length);
        System.out.println(java.util.Arrays.toString(numbers2));
        java.util.Arrays.sort(numbers2);
        System.out.println(java.util.Arrays.toString(numbers2));

        // multidimensional array
        int[][] numbers3 = new int[2][2];
        numbers3[0][0] = 10;
        numbers3[1][1] = 20;
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                System.out.print(numbers3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(java.util.Arrays.toString(numbers3)); // this will return the address of the array
        System.out.println(java.util.Arrays.deepToString(numbers3));// this will return the values of the array

        // multidimensional array with values
        int[][] numbers4 = { { 10, 20 }, { 30, 40 } };
        System.out.println(java.util.Arrays.deepToString(numbers4));
        for (int i = 0; i < numbers4.length; i++) {
            for (int j = 0; j < numbers4[i].length; j++) {
                System.out.print(numbers4[i][j] + " ");
            }
            System.out.println();
        }

    }

}
