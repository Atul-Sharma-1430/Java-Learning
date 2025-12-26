import java.util.Scanner;

class FibonacciRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int num = scanner.nextInt();

        FibonacciRecursion FB = new FibonacciRecursion();

        System.out.println("Fibonacci series up to " + num + " terms:");

        for (int i = 0; i < num; i++) {
            System.out.print(FB.fibonacci(i) + " ");
        }

        scanner.close();
    }


    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
