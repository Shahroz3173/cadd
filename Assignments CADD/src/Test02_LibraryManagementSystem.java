
import java.util.Scanner;


class Book {
    int bookNo;
    String bookName;
    boolean isIssued;

    Book(int bookNo, String bookName) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.isIssued = false;
    }

    void issue() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued");
        } else {
            System.out.println("Book already issued");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void display() {
        System.out.println("Book No: " + bookNo + ", Name: " + bookName + ", Issued: " + isIssued);
    }
}



public class Test02_LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book(101, "Java Basics");

        while (true) {
            System.out.println("\n1. Issue\n2. Return\n3. Display\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: b.issue(); break;
                case 2: b.returnBook(); break;
                case 3: b.display(); break;
                case 4: System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }
}



