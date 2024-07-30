package Exception;

import java.util.Scanner;

public class CustomException {
    /*
    Exception- an event after execution that disrupts the normal flow of the program
    Example: Arithmetic Exception, IO Exception, Null Pointer Exception
    
    User defined Exception- Custom Exception
    Which the user creates their own Exception
    */ 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you Age");
        int age=sc.nextInt();

        // in try block we check if the age is greater than 18
        // if age is less than 18 then it will throw a custom exception
        // the exception is then catched by the catch block
        // then it specifies what type of exception occured
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception occured "+e);
        }
    }

    static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("\nAge should be greater than 18");
        }else{
            System.out.println("Age is "+age+"\t You can vote");
        }
    }
    
}
