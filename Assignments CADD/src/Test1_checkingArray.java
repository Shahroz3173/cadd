import java.util.Scanner;

public class Test1_checkingArray {
    public static void main(String[] args) {
        int[] arr = {10, 13, 14, 15, 117};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element you want to check: ");
        int element = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                System.out.println("Yes, we found " + element);
                return;
            }
        }

        System.out.println(element + " is not present in the array.");
    }
}

