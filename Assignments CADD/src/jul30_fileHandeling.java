
import java.io.*;

public class jul30_fileHandeling {
    public static void main(String[] args) {
        String filename = "myself.txt";

        // Content to write in the file
        String aboutMe = "Hello, my name is Ankit.\n"
                + "I am a passionate learner and love programming in Java.\n"
                + "I enjoy solving problems and building creative projects.\n";

        // Writing to the file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(aboutMe);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }

        // Reading from the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("\nReading content from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }
}
