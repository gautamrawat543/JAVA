package YoutubeVideo.Oops;

public class ObjectPassing {
    public static void main(String[] args) {
        Car carName = new Car("Maruti");
        Garage garage = new Garage();

        garage.drive(carName);
    }
}

class Garage {

    void drive(Car car) {
        System.out.println("you are driving " + car.name + " car");
    }

}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}