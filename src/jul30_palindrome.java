import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class jul30_palindrome {
    public static void main(String[] args) {
        // pfunctionInterface
        Runnable runnable = () -> System.out.println("hello world");
        runnable.run();
        Callable<String> callable = () -> "hello my world";
        try {
            String Result = callable.call();
            System.out.println(Result);
        }catch (Exception instance){
            System.out.println("error"+ instance.getMessage());
        }

        Predicate <Integer> iseven = n -> n%2 == 0;

        System.out.println(iseven.test(10));
        System.out.println(iseven.test(11));
        System.out.println(iseven.test(12));




        Predicate <Integer> PALINDROME = n -> String.valueOf(n).equals(new StringBuilder(String.valueOf(n)).reverse().toString());
        System.out.println("is number palindrome ? " + PALINDROME.test(12221));




      //check the number is palindrome or not by using pedicate
    }
}
