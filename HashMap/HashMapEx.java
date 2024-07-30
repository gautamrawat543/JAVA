package HashMap;

import java.util.HashMap;

public class HashMapEx {
    /*
     * HashMap implements the Map Interface (needs import)
     * HashMap is similar to ArrayList but it contains key value pair
     * to stores objects inside angular brackets<> use Wrapper classes(Ex:-
     * Integer,Double,String,etc)
     */
    public static void main(String[] args) {
        // created hashmap with String as key and String as value
        HashMap<String, String> states = new HashMap<String, String>();
        // adding key value pair 
        states.put("MH", "Maharashtra");
        states.put("DL", "Delhi");
        states.put("JK", "Jammu and Kashmir");
        states.put("PB", "Punjab");
        states.put("UP", "Uttar Pradesh");

        // print hashmap
        System.out.println(states);

        // get value using key
        System.out.println(states.get("MH"));

        // remove value using key
        states.remove("PB");
        System.out.println(states);

        // check if key or value exists
        System.out.println(states.containsKey("UP"));
        System.out.println(states.containsValue("Jharkhand"));

        // get all keys and values
        System.out.println(states.keySet());
        System.out.println(states.values());

        // get size of the states
        System.out.println(states.size());

        // replace value using key
        states.replace("UP", "Uttar Pradesh Yogi");
        System.out.println(states);

        // iterate through hashmap
        for (String s : states.keySet()) {
            System.out.println(s + "\t" + "= " + states.get(s));
        }

        // clear hashmap
        states.clear();
        System.out.println(states);
    }

}
