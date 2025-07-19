public class jul10_AvgOfArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum =0;
        for (int num : arr) // for each loop
        {
            sum += num;
        }
        double average = (double) sum/arr.length;
        System.out.println(average);
    }
}
