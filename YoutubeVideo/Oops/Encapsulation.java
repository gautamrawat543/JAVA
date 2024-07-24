package YoutubeVideo.Oops;

public class Encapsulation {
    /*
     * Encapsulation = attributes of a class will be hidden or private,
     * Can be accessed only through methods (getters & setters)
     * You should make attributes private if you don't have a reason to make them
     */
    public static void main(String[] args) {
        MyCar car1 = new MyCar("BMW", "red", 2020);
        // System.out.println(car.name); this will be not visible as it is private so we
        // use getter and setters
        System.out.println(car1.getName());
        car1.setName("Mercedes");
        System.out.println(car1.getName());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
        car1.setYear(2022);
        System.out.println(car1.getYear());

        System.out.println();
        // Now we are going to see how to copy objects
        MyCar car2 = new MyCar("BMW", "red", 2020);
        MyCar car3 = new MyCar("Tesla", "black", 2021);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car2.getName());
        System.out.println(car3.getName());
        // now lets say i want to copy car2 to car3
        // car3=car2; //this is wrong , they both will point to the same object/address
        // System.out.println(car2);
        // System.out.println(car3);
        // so we will make a copy method to do that in MyCar class
        car3.copy(car2); // now they have different address but same values
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car2.getName());
        System.out.println(car3.getName());
        System.out.println();
        // Also if we want to make a copy during initialization we can do it by
        // MethodOverloading(in this case Constructor Overloading)
        MyCar car4 = new MyCar(car1);
        System.out.println(car1.getName());
        System.out.println(car4.getName());
    }

}

class MyCar {
    private String name;
    private String color;
    private int year;

    MyCar(String name, String color, int year) {
        // this.name = name; this works but not a good practice so we will use
        // this.color = color; the setters to set the values
        // this.year = year;

        this.setName(name);
        this.setColor(color);
        this.setYear(year);

    }

    // copy constructor
    MyCar(MyCar x) {
        this.copy(x);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // copy method
    public void copy(MyCar x) {
        this.setName(x.getName());
        this.setColor(x.getColor());
        this.setYear(x.getYear());
    }
}
