import java.util.Scanner;

public class jul9_AddTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2], b = new int[2][2], sum = new int[2][2];

        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
//            for (int j = 0; j < 2; j++)
//                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
