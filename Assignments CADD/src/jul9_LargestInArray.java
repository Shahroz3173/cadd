public class jul9_LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 67};

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}


