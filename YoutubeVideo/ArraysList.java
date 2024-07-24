package YoutubeVideo;

import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {
        /*
         * ArrayList are resiable arrays
         * Elements can be added and removed after compilation phase
         * they store reference datatype
         */

        // ArrayList creation
        ArrayList<String> foods = new ArrayList<String>();

        // adding elements
        foods.add("bread");
        foods.add("milk");
        foods.add("chips");

        // printing with for loop
        for (int i = 0; i < foods.size(); i++) { // for ArrayList we use size() instead of length
            System.out.println(foods.get(i));  // get() is used to get the elements
        }
        System.out.println();

        // to set an element
        foods.set(0, "cheese"); // this will replace the old element with the new one

        // to remove an element
        foods.remove(2); // this will remove the element at index 1
        for (int i = 0; i < foods.size(); i++) { // for ArrayList we use size() instead of length
            System.out.println(foods.get(i));  // get() is used to get the elements
        }

        // to clear the list
        foods.clear();

System.out.println();
        /*
         * 2D ArrayList is a dynamic list of lists
         * we can change the size of the 2D ArrayList after compilation(during runtime)
         */

        ArrayList<ArrayList<String>> foodList = new ArrayList<ArrayList<String>>();

        ArrayList<String> breakfast = new ArrayList<String>();
        breakfast.add("bread");
        breakfast.add("milk");
        breakfast.add("chips");
        System.out.println(breakfast);

        ArrayList<String> lunch = new ArrayList<String>();
        lunch.add("rice");
        lunch.add("noodles");
        lunch.add("pasta");
        System.out.println(lunch);

        ArrayList<String> dinner = new ArrayList<String>();
        dinner.add("jeera rice");
        dinner.add("curry");
        System.out.println(dinner);

        foodList.add(breakfast);
        foodList.add(lunch);
        foodList.add(dinner);
        System.out.println(foodList);
        System.out.println(foodList.get(1));  // gets the lunch list
        System.out.println(foodList.get(1).get(2)); // gets the pasta from the lunch list
    }

}
