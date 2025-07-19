

import java.util.Scanner;

public class jul9_StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name, studentClass, section, address;
        int age, rollNumber;
        double marks;


        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter student age: ");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter class: ");
        studentClass = scanner.nextLine();

        System.out.print("Enter roll number: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter marks: ");
        marks = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter section: ");
        section = scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();


        System.out.println("\nStudent ki Details:");
        System.out.println("Aapka Name: " + name);
        System.out.println("Aapka Age: " + age);
        System.out.println("Aapka Class: " + studentClass);
        System.out.println("Aapka Roll Number: " + rollNumber);
        System.out.println("Aapka Marks: " + marks);
        System.out.println("Aapka Section: " + section);
        System.out.println("Aapka Address: " + address);

        // Close the scanner
        scanner.close();
    }
}
