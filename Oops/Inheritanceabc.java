package Oops;

class Shape {
    String color;
}

// trainle class ne shape ki properties and methods ko inherit kr liye apne
// andar le liya
class Triangle extends Shape { // iss case mein properties ho gyi color

}

public class Inheritanceabc {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "blue"; // trianle class ke andar color property define nhi kiya par shape class se
                           // inherit kiya
    }
}

/*
 * single level- ek base class ek derived class
 * multi level- ek base class uska derived class or phir derived class se vapas
 * se ek derived class
 * hirarchial- ek base class or multiple derived class
 * hybrid - mix
 */