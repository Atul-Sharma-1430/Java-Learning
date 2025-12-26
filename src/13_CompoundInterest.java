import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest (R) in %: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (T) in years: ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);

        double compoundInterest = amount - principal;

        System.out.println("The Compound Interest is: " + compoundInterest);
        System.out.println("The Total Amount after " + time + " years is: " + amount);

        sc.close();
    }
}
