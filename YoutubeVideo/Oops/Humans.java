package YoutubeVideo.Oops;

public class Humans {
    String gender;
    String name;
    int age;
    double height;

    Humans(String gender, String name, int age, double height) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void work() {
        if (this.gender == "male") {  // this.gender.equals("male")
            System.out.println(this.name + " is working");
        } else {
            System.out.println(this.name + " is cooking");
        }
    }

    void walk(){
        System.out.println(this.name + " is walking");
    }

}
