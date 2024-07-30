package YoutubeVideo.Oops;

import java.util.Scanner;

public class Polymorphism {
    /*
     * Polymorphism is the ability of an object to take many forms.
     * is the ability to identify as one than more types.
     */
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Horse horse = new Horse();
        // dog.tame(); this can be used but it is not a good practice
        // tiger.tame();
        // horse.tame();

        Animal[] animals = { dog, tiger, horse }; 
        // polymorphism- dog, tiger, horse have Animal class in common as they all extends Animal class
        // instead of calling tame() three times we can call it once using parent class
        for (Animal a : animals) {
            a.tame();
        }

        // Dynamic Polymorphism - after compilation(during runtime)
        Scanner sc = new Scanner(System.in);
        Animal petAnimal;
        System.out.println("What animal do you want to pet?");
        System.out.print("Chooose 1 for Dog and 2 for Cat: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            petAnimal = new Dog(); // objects are creating at run time
            petAnimal.speak();
        } else if (choice == 2) {
            petAnimal = new Cat();
            petAnimal.speak();
        } else {
            petAnimal = new Animal();
            petAnimal.speak();
            System.out.println("You Choose Poorly");
        }
        sc.close();
    }

}

class Animal {
    public void tame() {
    }

    // for dynamic polymorphism
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {

    @Override
    public void tame() {
        System.out.println("Dog is tamed");
    }

    // for dynamic polymorphism
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}

class Tiger extends Animal {

    @Override
    public void tame() {
        System.out.println("Tiger is not tamed");
    }
}

class Horse extends Animal {

    @Override
    public void tame() {
        System.out.println("Horse can be tamed or not tamed");
    }
}

// for dynamic polymorphism
class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println("Cat meows");
    }
}