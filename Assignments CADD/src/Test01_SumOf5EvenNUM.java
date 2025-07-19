public class Test01_SumOf5EvenNUM {

    public static int sumEven(int n) {
        if (n == 1) {
            return 2;
        }
        return (2 * n) + sumEven(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("sum of 5 evnn numbers :");
        int result = sumEven(5);
        System.out.println("Sum of first 5 even numbers: " + result);


    }
}

/* STRING BUFFER
used in changing the string immutable into the mutable
string buffer is slower than the string builder because it uses multi threading
STRING BUILDER
it is also used in turning string immutable into mutable
it is faster because it works on single threading
 */
