package Generic;

public class GenericClassEx {
    public static void main(String[] args) {
        // Traditionally we would have to make a class for each data type but we will be
        // using a Generic Class to make all four datatype here

        // MyIntegerClass myInt= new MyIntegerClass();
        // MyDoubleClass myDouble = new MyDoubleClass();
        // MyCharacterClass myChar = new MyCharacterClass();
        // MyStringClass myString = new MyStringClass();

        // here with one class i made all the data types
        // angular brackets are required so the class can undertand what datatype is
        // being created
        MyGenericClass<Integer> myInt = new MyGenericClass<>(10);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(100.10);
        MyGenericClass<Character> myChar = new MyGenericClass<>('a');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        // we can also pass multiple data types in the class
        // we can also bound the data we send to the class(check in
        // MyGenericClass2.java)
        // i have bounded the 1st parameter by number so u cant pass a string/char
        MyGenericClass2<Integer, Integer> myInt2 = new MyGenericClass2<>(10, 20);
        MyGenericClass2<Double, Double> myDouble2 = new MyGenericClass2<>(100.10, 200.20);
        // uncomment and check the below code
        // MyGenericClass2<Character, Character> myChar2 = new
        // MyGenericClass2<>('a','b');
        // MyGenericClass2<String, Character> myString2 = new MyGenericClass2<>("Hello",
        // '@');
        System.out.println(myInt2.getValueY());
        System.out.println(myDouble2.getValueY());
        // bounded types - you can create the objects of generic class to have data of
        // specific derived types(Ex:- Number)
    }

}
