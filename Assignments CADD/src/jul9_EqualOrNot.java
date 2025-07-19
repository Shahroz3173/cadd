import java.util.Scanner;

public class jul9_EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, cols;
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];
        int[][] arr2 = new int[rows][cols];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr1[i][j] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr2[i][j] = sc.nextInt();

        boolean isEqual = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual) break;
        }

        if (isEqual)
            System.out.println("Both arrays are equal.");
        else
            System.out.println("Arrays are NOT equal.");

        sc.close();
    }
}
