import javax.crypto.spec.PSource;
import java.io.*;
import java.util.Scanner;

public class jul30_fileHandeling {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File Created : " + file.getName());
            } else {
                System.out.println("File are already existed.");
            }
        } catch (IOException e) {
            System.out.println("an error occured : " + e.getMessage());
        }
        String filename = "example.txt";
        String content = "hello handsome world";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("FILE CREATED AND WRITE SUCCESSFULLY.");

        } catch (IOException e) {
            System.out.println("ERROR WRITING A FILE : " + e.getMessage());
        }
        //check file is alredy exist or not
//        File file1 = new File("example.text");
//        if(file1.exists()){
//            System.out.println("file is already exist");
//
//        }else {
//            System.out.println("file is not exist");
//        }
        try (FileReader reader = new FileReader(filename)) {
            int character;
            System.out.println("File contents:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDo you want to enter a message? Type below: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);

        scanner.close();


    }
}