import java.io.*;
// 07 aug 25

public class test04_bufferreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter file name: ");
        String fileName = br.readLine();

        System.out.print("Enter some text: ");
        String text = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(text);
        bw.close();

        System.out.println("File saved.");
    }
}
