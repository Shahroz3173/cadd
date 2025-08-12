import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class test05_FunctionalInterfaces {

    public static void main(String[] args) throws Exception {
        // na input lega or na hi retun dega
        Runnable runnable = () -> System.out.println("Runnable running...");
        runnable.run();

        // ye ek value return karta hai
        Callable<String> callable = () -> "Callable result";
        System.out.println("Callable returned: " + callable.call());

        // input toh lega lekin return boolen me dega
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
    }
}
