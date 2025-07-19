import java.util.Arrays;

public class jul8_arrays {
    public static void main(String[] args) {
        int []arr = {1,2,3,9,34,4,5};
        int[]arr1 = new int[5];
        Arrays.fill(arr1, 233);
        System.out.println(Arrays.toString(arr1));

        int[] copy =  Arrays.copyOfRange(arr1 ,0,3);
        System.out.println(Arrays.toString(copy));

        System.out.println(Arrays.equals(arr1,copy));


//        arr1[0] = 15;
//        arr1[1] = 20;
//        arr1[2] = 45;
//        arr1[3] = 65;
//        arr1[4] = 87;
//
//        System.out.println(arr1[2]);
//        System.out.println("---------------------");
//
//        for (int i = 0; i<arr1.length ; i++){
//            System.out.println(arr1[i]);
//        }

        System.out.println("_______________________");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

       // int index = Arrays

        int[] arr2 = new int[5];
//        Arrays.setAll(arr2, );









    }



}
