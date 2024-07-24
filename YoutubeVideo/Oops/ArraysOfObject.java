package YoutubeVideo.Oops;

public class ArraysOfObject {

    // array of object  
    /*
     * with food class we created a objects and then
     * stored that objects in an array  
     * the array being of food class  (istead of traditional array of strings,int,etc)
     * We gave the datatype Food instead of String, Integers,etc
     */

    public static void main(String[] args) {
        // First creating some objects

        Food f1 = new Food("Pizza");
        Food f2 = new Food("Burger");
        Food f3 = new Food("Pasta");
        Food f4 = new Food("Noodles");

        // Now creating an array of objects
        // Food [] refrigerator =new Food[4];


        // Now storing the objects in the array
        // refrigerator[0]=f1;
        // refrigerator[1]=f2;
        // refrigerator[2]=f3;
        // refrigerator[3]=f4;

        Food [] refrigerator={f1,f2,f3,f4}; // also can create like this


        System.out.println(refrigerator[1].name);
    }
    
}


class Food{

    String name;

    Food(String name){
        this.name = name;
    }

}