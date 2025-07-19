import java.util.Scanner;
public class jul9_Matrix3x4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][3];

        
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 3; j++)
                mat[i][j] = sc.nextInt();


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
