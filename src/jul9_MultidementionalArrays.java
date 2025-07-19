import java.util.Arrays;

public class jul9_MultidementionalArrays {
    public static void main(String[] args) {
//        int [][] arr= {{1,2,3},{5,6,7},{7,8,9}};
//        System.out.println(Arrays.deepToString(arr));//for printing a array
        int [][] arr1 = new int[3][3];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr1[2][0] = 7;
        arr1[2][1] = 8;
        arr1[2][2] = 9;
        System.out.println(Arrays.deepToString(arr1));
        int a= arr1[0][2];
        System.out.println(a);


        //2D array

        for(int i = 0; i< arr1.length;i++){
            for(int j = 0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

        String [][] arr2 = {
                {"aalo","matar","tamatar"},{"mudit","mudi","mud"},{"aayush","aauu","Aaalu"}
        };
        System.out.println(Arrays.deepToString(arr2));







    }
}
