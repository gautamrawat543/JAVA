package Oops;

class Pen {
    String color;
    String type;

    public void printColorType() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        System.out.println("construction working was called  ");
        this.name = name;
        this.age = age;
    }
}

public class ObjectClass {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ball";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "gel";

        pen1.printColorType();
        pen2.printColorType();

        Student s1 = new Student("rawat", 3); // constructor se he data pass kr diya
        s1.printInfo();
    }
}
