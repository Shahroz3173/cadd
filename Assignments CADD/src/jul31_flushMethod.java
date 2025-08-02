

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class jul31_flushMethod {
    public static void main(String[] args) {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));


            writer.write("Hello, this is an example using BufferedWriter.");
            writer.newLine();
            writer.write("We will use flush() and close() methods.");


            writer.flush();

            System.out.println("Data flushed to the file.");


            writer.close();

            System.out.println("BufferedWriter closed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}