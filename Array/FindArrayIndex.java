package Array;

import java.util.*;

public class FindArrayIndex {

    public static void findArrayIndex(int[] sample) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nenter the number of which you want to find index- ");
        int num = sc.nextInt();
        boolean hi = false;
        for (int i = 0; i < sample.length; i++) {
            if (num == sample[i]) {
                System.out.println("Index of " + num + " is " + i);
                hi = true;
            }
        }
        if (hi == false) {
            System.out.println("number not found");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size- ");
        int size = sc.nextInt();
        int[] sampleArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("enter " + i + " element ");
            sampleArray[i] = sc.nextInt();
        }
        System.out.println("Your array is- ");
        for (int i = 0; i < size; i++) {
            System.out.print(sampleArray[i] + " ");
        }
        findArrayIndex(sampleArray);
        sc.close();
    }
}
