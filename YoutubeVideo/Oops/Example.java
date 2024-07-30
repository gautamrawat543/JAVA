package YoutubeVideo.Oops;

public class Example {

    public static void main(String[] args) {
        Humans human1 = new Humans("male", "gautam", 22, 175.5);
        Humans human2 = new Humans("female", "mahila", 25, 172.8);

        System.out.println(human1.name);
        System.out.println(human2.name);

        human1.work();
        human2.work();

        human1.walk();
        human2.walk();

        // Method OverRiding
        MethodOverriden student = new MethodOverriden();
        // .toString method is always there in java package so we can use it
        // and we can override it

        System.out.println(student.name); // here it is implicitly calling the parent class method

        System.out.println(student.toString()); // this calls the memory location where student is stored

        // after creating .toString in MethodOverriden class
        // we can call it both implicitly and explicitly

        System.out.println(student); // this is implicitly calling

    }

}
