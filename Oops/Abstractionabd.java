package Oops;

abstract class Animal {
    // public void walk(){}
    abstract void walk();

    public void eats() {
        System.out.println("Animal can eat");
    }

    Animal() {
        System.out.println("Creating a new Animal");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }

    Horse() {
        System.out.println("Horse is created");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks in 2 legs");
    }

    public void eats() {
        System.out.println("Chicken can eat");
    }

    Chicken(){
        System.out.println("Chicken is created");
    }
}

public class Abstractionabd {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eats();

        Chicken c1 = new Chicken();
        c1.walk();
        c1.eats();
    }
}
