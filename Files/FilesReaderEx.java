package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesReaderEx {
    public static void main(String[] args) {
        // to read the contents or data inside a file
        try {
            FileReader reader = new FileReader("Files/poem.txt"); // give the file path
            int data = reader.read(); // read the data but return them in integer format
            while (data != -1) {  // when data is -1 it means the file ends
                System.out.print((char) data); // every character is printed so need to typecast to char
                data = reader.read();
            }
            reader.close();  // close the reader
        } catch (FileNotFoundException e) {  // Handling the exception is mandatory
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
