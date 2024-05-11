package Array;
import java.util.*;

public class BasicArray {

    public static void basicInitialize(){
        int [] marks=new int [3];
        marks[0]=45;
        marks[1]=55;
        marks[2]=65;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
    for(int i=0;i<3;i++){
        System.out.println(marks[i]);
    }


    }

    public static void basicInitialize2(){
        int [] marks={97,86,75};
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }

    public static void userInputArraySize(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int [] marks=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter "+i+" element ");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }

    public static void main(String[] args) {
        basicInitialize();
        System.out.println();
        basicInitialize2();
        System.out.println();
        userInputArraySize();

    }
}
