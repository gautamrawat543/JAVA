package Oops;
// called as function overloading is a compile time polymorpism

// Different function but same name

//  Compile time means ki jab likh rahe hai code tabhi error dene lagta hai

class Students {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphabc {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.age = 18;
        s1.name = "gautamrawta";
        s1.printInfo(32);
        s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);
    }
}
