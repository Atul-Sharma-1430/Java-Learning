import java.util.Scanner;

class AllArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nArithmetic Operations Results:");

        // Addition
        int sum = num1 + num2;
        System.out.println("Addition (num1 + num2) = " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Subtraction (num1 - num2) = " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Multiplication (num1 * num2) = " + product);

        // Division (check for division by zero)
        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("Division (num1 / num2) = " + division);
        } else {
            System.out.println("Division: Cannot divide by zero!");
        }

        // Modulus (remainder)
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("Modulus (num1 % num2) = " + remainder);
        } else {
            System.out.println("Modulus: Cannot divide by zero!");
        }

        sc.close();
    }
}
