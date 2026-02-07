import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {   
            System.out.println("Enter a number:");
            try {   
                int num = sc.nextInt();   
                System.out.println("You entered: " + num);
                sc.close();
                System.exit(0); // Ensures that the program exits immediately after successful input means finally will not execute.

            } catch (Exception e) {
                method1(); // Rethrow as InputMismatchException to be caught by outer catch block.
            }

        } catch (InputMismatchException e) {   
            System.out.println("Please Enter integer number.");
            System.out.println("Error: " + e);
        } finally {
            System.out.println("This block will not execute now.");
        }

        sc.close();
    }

    public static void method1() throws InputMismatchException {
        throw new InputMismatchException("Invalid input. Please enter an integer.");
    }
}
