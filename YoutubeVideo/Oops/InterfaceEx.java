package YoutubeVideo.Oops;

public class InterfaceEx {
    /*
     * interface is a template for a class that can be applied to multiple classes
     * it only specifies what a class must do
     * a single class can apply multiple interfaces
     */
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
    
}


class Rabbit implements Prey{

    @Override
    public void flee() {
        System.out.println("rabbit is running");
    }}

class Hawk implements Predetor{

    @Override
    public void hunt() {
        System.out.println("hawk is hunting");
    }}

class Fish implements Predetor, Prey{

    @Override
    public void flee() {
        System.out.println("fish is running from big fish");
    }

    @Override
    public void hunt() {
        System.out.println("fish is hunting small fish");
    }}