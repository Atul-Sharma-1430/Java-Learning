import java.util.Scanner;

class EvenOddUsingBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number");
        }

        sc.close();
    }
}
