
import java.util.concurrent.Callable;

public class jul30_callable {
    public static void main(String[] args) throws Exception {
        int x = 4;

        Callable<Integer> compute = () -> 3 * x * x + 2 * x + 5;

        System.out.println("Result: " + compute.call());  // Output: 69 when x = 4
    }
}