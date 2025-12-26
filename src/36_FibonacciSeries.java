import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int terms =sc.nextInt();

        int first = 0, second = 1;
        if (terms <= 0) {
            System.out.println("Enter a positive number.");
        } else if (terms == 1) {
            System.out.println("Fibonacci Series up to 1 term: " + first);
        } else {
            System.out.println("The Fibonacci Series up to " + terms + " term are :" );
            System.out.print(first);
            System.out.print(" " + second);
            for (int i = 1; i <= terms-2; i++) {
                int next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;
            }
        }
        sc.close();
    }
}
