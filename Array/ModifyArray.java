package Array;
import java.util.*;


public class ModifyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] sampleArray={32,12,23,1,56,78,4,9};
        System.out.println("original Array- ");
        for(int i=0;i<sampleArray.length;i++){
            System.out.print(sampleArray[i]+" ");
        }

        System.out.print("\nchange array number\nenter the array index you want to change-");
        int index=sc.nextInt();
        System.out.print("enter the prefered number- ");
        int number=sc.nextInt();
        sampleArray[index]=number;

        System.out.println("New Array- ");
        for(int i=0;i<sampleArray.length;i++){
            System.out.print(sampleArray[i]+" ");
        }
        sc.close();
        //sorting array

        Arrays.sort(sampleArray);
        System.out.println("\nSorted Array- ");
        for(int i=0;i<sampleArray.length;i++){
            System.out.print(sampleArray[i]+" ");
        }
    }
}
