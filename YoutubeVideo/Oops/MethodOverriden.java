package YoutubeVideo.Oops;

public class MethodOverriden {

    /*
     * .toString() method is used to convert an object to String.
     * It can be used both implicitly and explicitly.
     */
    // See in Example class

    String name = "gautam";
    String email = "gautam@gmail";
    String password = "gautam123";

    @Override // this is used to tell that this method is overriding the parent class method
    public String toString() {
        return name + " " + email + " " + password;
    }

}
