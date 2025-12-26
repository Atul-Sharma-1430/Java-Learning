import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        // Count the number of digits by making it as a String
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;          // Extract last digit
            sum += (int)Math.pow(digit, digits); // Raise to the power of digits and add
            num /= 10;                     // Remove last digit
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
