package Question_87;

import java.util.Scanner;
public class ExceptionHandling {

    public static void divide(int num1, int num2) {
        try{
           System.out.println(num1 / num2);
        } catch(ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Division by Zero is not Possible");
            } else {
                throw e;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Divide Calculator.\n");
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();;
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        divide(num1, num2);
        sc.close(); 
    }
}
