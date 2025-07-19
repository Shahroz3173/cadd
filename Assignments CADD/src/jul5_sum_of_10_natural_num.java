public class jul5_sum_of_10_natural_num {
    public static void main(String[] args) {
        System.out.println("sum of all numbers from 1 to 10");
        int sum = 0;


        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of natural numbers from 1 to 10 is: " + sum);
    }
}
