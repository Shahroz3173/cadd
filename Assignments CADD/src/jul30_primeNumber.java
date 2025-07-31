import java.util.function.Predicate;

public class jul30_primeNumber {

    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> n > 1 &&
                java.util.stream.IntStream.range(2, n).allMatch(i -> n % i != 0);

        System.out.println(isPrime.test(7));
        System.out.println(isPrime.test(10));
    }
}