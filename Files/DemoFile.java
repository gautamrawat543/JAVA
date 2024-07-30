package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

        System.out.println();

        // File Writer class how to write inside a file
        try { 
            // this can create or rewrite the existing file
            FileWriter writer = new FileWriter("Files/poem.txt"); // file name, can also provide path
            writer.write("Hello Gautam\nHow are you\nWish u well"); // this will rewrite the file
            writer.append("\nThis line is appended"); // adds a new line to the file
            writer.close(); // always close the file writer

        } catch (IOException e) {// file writer should always have an exception block
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
