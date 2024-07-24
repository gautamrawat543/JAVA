package YoutubeVideo.Oops;

public class KeywordSuper {
    // super keyword - this refers to the super class(parent class) of an object
    // very similar to "this" keyword

    public static void main(String[] args) {
        Hero hero1 = new Hero("Batman", 40, "money");
        Hero hero2 = new Hero("Superman", 50, "flight/strength");
        Hero hero3 = new Hero("Flash", 20, "fast");

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}

class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        // this.name = name; this works but not a good practice so we will use super
        // keyword
        // this.age = age;
        super(name, age); // this refers to the parent class in this case Person
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.power;
    }
}