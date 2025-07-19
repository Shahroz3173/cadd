import java.util.Scanner;

public class Test01_tableof7 {
    public static void main(String[] args) {
        System.out.println("table of 7 ");
        System.out.print("enter the number :- ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num + "X" + i + "=" + num*i);
            i++;
        }
    }
}
