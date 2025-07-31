import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class jul30_functionalInterface {
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("hello world ");
        runnable.run();
        Callable<String> callable = ()-> "hello world ";

        try{

            String Result = callable.call();
            System.out.println(Result);

        }catch (Exception instance){

        }
        Predicate<Integer> iseven = n-> n%2==0;
        System.out.println(iseven.test(10));
        System.out.println(iseven.test(11));
        System.out.println(iseven.test(12));

    }
}
