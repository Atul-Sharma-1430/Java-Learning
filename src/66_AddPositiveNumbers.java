import java.util.Scanner;

class AddPositiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers to add (enter 0 to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                System.out.println("Negative number ignored.");
                continue;
            }

            sum += number;  // Add positive number to sum
        }

        scanner.close();
        System.out.println("Sum of all positive numbers: " + sum);
    }
}
