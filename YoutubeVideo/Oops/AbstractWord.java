package YoutubeVideo.Oops;

public class AbstractWord {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(); abstract class cannot be instantiated
        Carrr car = new Carrr();
        car.run();
    }
}

abstract class Vehicle {
    abstract void run(); // abstract method
}

class Carrr extends Vehicle {
    // subclass of abstract class should implement all the abstract methods

    @Override
    void run() {
        System.out.println("car is running");
    }
}

/*
 * this is about Access Modifiers
 * public: visible in all classes in all packages
 * protected: visible to all classes in the same package or classes in other
 * packages that are a subclass
 * default: visible to all classes in the same package
 * private: visible only in the same class
 */