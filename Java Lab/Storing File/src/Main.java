import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("D:\\101\\MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            System.out.println("Enter values to be written in the file:");
            String text =  sc.next();
            text += sc.nextLine();
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write("Done???");

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
