
import java.io.*;

public class jul31_ResetMethod {
    public static void main(String[] args) {
        try {
            String data = "Hello\nWorld\nJava";
            BufferedReader reader = new BufferedReader(new StringReader(data));

            System.out.println("First line: " + reader.readLine());

            // Mark current position
            reader.mark(100);  // mark with readAheadLimit

            System.out.println("Second line: " + reader.readLine());
            System.out.println("Third line: " + reader.readLine());

            // Reset to the marked position
            reader.reset();

            
            System.out.println("After reset:");
            System.out.println("Second line again: " + reader.readLine());
            System.out.println("Third line again: " + reader.readLine());

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
