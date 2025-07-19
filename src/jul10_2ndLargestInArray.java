import java.util.Arrays;

public class jul10_2ndLargestInArray {
    public static void main(String[] args) {
        int[] array = {23,24,25,27,26};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int secLargest = array.length-2;

        System.out.println(array[secLargest]);







    }
}
