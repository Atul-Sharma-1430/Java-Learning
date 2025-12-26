import java.util.Scanner;

class EvenNumbersPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        System.out.println("Even numbers from 1 to " + limit + ":");

        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        scanner.close();
    }
}
