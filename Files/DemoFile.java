package Files;

import java.io.File;

public class DemoFile {
    // file is an abstract representation of a file or directory on the file system.
    public static void main(String[] args) {
        File file = new File("DSAWebsite/algorithmsites.txt"); // give the path of the file
        File file2 = new File("C:/Users/gauta/Desktop/MCA");
        if (file.exists()) {
            System.out.println("File exists");
            System.out.println(file.toPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
        } else {
            System.out.println("File does not exist");
        }
        if (file2.exists()) {
            System.out.println("File2 exists");
            System.out.println(file2.toPath());
            System.out.println(file2.getAbsolutePath());
            System.out.println(file2.isFile());
            System.out.println(file2.isDirectory());

        } else {
            System.out.println("File2 does not exist");
        }
    }

}
