package Oops;

import Example.examplegcd;

// import Oops.Pen;

class Modifier {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Package_Example {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "ball";
        p1.printColorType();
        examplegcd.calculateGcd(150, 100);

        Modifier m1 = new Modifier();
        m1.name = "gautam";
        m1.email = "gautam@gmail.com";
        // m1.password="abcd"; ==> The field Modifier.password is not visible
        m1.setPassword("abcdef");
        System.out.println(m1.getPassword());
    }
}
