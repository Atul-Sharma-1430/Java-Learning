import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest (R) in %: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (T) in years: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);

        sc.close();
    }
}
