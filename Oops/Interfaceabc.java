package Oops;

interface Animals {
    int eyes = 2;// it is public static final means cannot change

    void walks();

    public void eats();
}

interface Herbivore {
}

// called Multiple inheritance 2 base class 1 derived class
class Horses implements Animals, Herbivore {
    public void walks() {
        System.out.println("walks on 4 legs");
    }

    public void eats() {
        System.out.println("Animal can eat");
    }

}

public class Interfaceabc {
    public static void main(String[] args) {
        Horses h1 = new Horses();
        h1.walks();
        h1.eats();
    }
}
// now add folder from acer