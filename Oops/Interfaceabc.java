package Oops;

/*
 * Any method in an interface is by default public abstract
 * that means when we implement an interface in a class we should also implement
 *  all the methods inside the interface
 */
interface Animals {
    int eyes = 2;// it is public static final means cannot change

    void walks(); // by default public abstract

    public void eats(); // by default public abstract
}

interface Herbivore {
    void eatsOnly(); // by default public abstract
}

// called Multiple inheritance 2 base class 1 derived class
class Horses implements Animals, Herbivore {

    @Override
    public void walks() {
        System.out.println("walks on 4 legs");
    }

    @Override
    public void eats() {
        System.out.println("Animal can eat");
    }

    @Override
    public void eatsOnly() {
        System.out.println("Animal can eat only grass");
    }

}

public class Interfaceabc {
    public static void main(String[] args) {
        Horses h1 = new Horses();
        h1.walks();
        h1.eats();
        h1.eatsOnly();
    }
}
// now add folder from acer
// folder from acer added