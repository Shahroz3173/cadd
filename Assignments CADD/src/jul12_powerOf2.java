import java.util.Scanner;
public class jul12_powerOf2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER A NUMBER :");
            int num = scanner.nextInt();
            if (isPowerOfTwo(num)){
                System.out.println("the number " + num + " is power of 2");
            }
            else {
                System.out.println("the number " + num + " is not of power of 2");
            }
        }
        public static boolean isPowerOfTwo(int n) {
            if (n <= 0) {
                return false;
            }
            return (n & (n - 1)) == 0;
        }


}
