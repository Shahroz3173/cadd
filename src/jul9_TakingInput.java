import java.util.Scanner;

public class jul9_TakingInput {
    public static void main(String[] args) {
        System.out.println("welcome to learning user input");

        Scanner input = new Scanner(System.in);
        System.out.print("enter ypur name: ");
        String name = input.nextLine();

        System.out.print("entar your age: ");
        int age = input.nextInt();

        System.out.print("enter ypur marks: ");
        double marks = input.nextDouble();



    }
}
