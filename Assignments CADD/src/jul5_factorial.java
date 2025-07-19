import java.util.Scanner;

public class jul5_factorial {
    public static void main(String[] args) {
        System.out.println("finding factorial");
        System.out.print("enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num<2){
            System.out.println("the factorial  of " + num + " is 1 ");
        }
         int fact = 1;
        int i = 2 ;
        while(i<=num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial is " + fact);

    }

}
