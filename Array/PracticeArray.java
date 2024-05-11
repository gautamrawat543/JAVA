package Array;
import java.util.*;

public class PracticeArray {

    public static void inputName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name array size-");
        int size=sc.nextInt();
        String [] name=new String[size];
        for(int i=0;i<name.length;i++){
            name[i]=sc.next();
        }
        sc.close();
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
    }
    
    
    public static void maxminArray(){
        int [] number={23,65,23,98,34,78,45,7,45,67,567,34,65};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("\n"+max);
        System.out.println(min);
        for(int i=0;i<number.length;i++){
            if(max<number[i]){
                max=number[i];
            }
            if(min>number[i]){
                min=number[i];
            }
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println("\nMaximun number is "+max+"\nMinimum number is "+min);
    }

    public static void checkAscendingOrder(){
        int [] order={1,2,3,4,5,6,7,8,9};
        boolean isAscending=true;
        for(int i=0;i<order.length-1;i++){
            if(order[i]>order[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("array is in ascending order");
        }else{
            System.out.println("Array is not in ascending order");
        }
    }

    public static void main(String[] args) {
        inputName();
        maxminArray();
        checkAscendingOrder();
    }
}
