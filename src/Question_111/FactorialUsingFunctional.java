package Question_111;


import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialUsingFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int factorial = IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
        System.out.println(factorial);
        sc.close();
    }
}
