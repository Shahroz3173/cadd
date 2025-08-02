import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jul31_buffer {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name : ");
            String input = reader.readLine();
            System.out.println("hello " + input);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }
}
