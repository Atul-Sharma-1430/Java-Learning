package Question_88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the file:");
        String fName = sc.next();

        try(FileReader reader = new FileReader(fName)) {
            int read;
            while((read = reader.read()) != -1) { // imp
                System.out.print((char)read);
            }
        } catch (FileNotFoundException FNFe) {                    // FileNotFoundException extends IOException internally
            System.out.printf("%s File NOt Found", fName);
        } catch(IOException IOe) {
            System.out.printf("Exception occured: %s", IOe.getMessage());
        }

        sc.close();
    }
}