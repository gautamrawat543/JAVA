package Enum;

enum Planets {
    // numbers are associated with position from sun
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    Planets(int number) {
        this.number = number;

    }

}

public class EnumBasic {
    /*
     * Enum- Enumerated (ordered lists of item in a collection)
     * grouping of constants that behave similarly to each other
     * You cannot change the value of an enum
     */

    public static void main(String[] args) {
        Planets myPlanet = Planets.VENUS;
        canILiveHere(myPlanet);
    }

    static void canILiveHere(Planets planet) {
        switch (planet) {
            case EARTH:
                System.out.println("You Can Live Here");
                System.out.println("Your Planet Number is " + planet.number);
                break;

            default:
                System.out.println("You Can't Live Here");
                System.out.println("Your Planet Number is " + planet.number);
                break;
        }
    }

}
