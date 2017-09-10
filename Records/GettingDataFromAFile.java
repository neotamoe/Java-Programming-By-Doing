import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class GettingDataFromAFile {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        BufferedReader inputStream = null;
        // PrintWriter outputStream = null;

        System.out.print("Which file to open? ");
        String file = keyboard.next();
        System.out.println("Reading data from " + file );
        System.out.println();
        try {
            inputStream = new BufferedReader(new FileReader(file));
            // outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));

            // String l;
            // while ((l = inputStream.readLine()) != null) {
            //     System.out.println(l);
            // }
            System.out.println("First dog: " + inputStream.readLine());
            System.out.println("Second dog: " + inputStream.readLine());
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            // if (outputStream != null) {
            //     outputStream.close();
            // }
        }
    }
}
