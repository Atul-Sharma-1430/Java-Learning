import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int  num2 = sc.nextInt();

        if (num1 < 1 || num2 < 1) {
            System.out.println("Enter valid numbers.");
            return;
        }

        int greatest , smallest;
        if ( num1 > num2 ) {
            greatest = num1;
            smallest= num2;
        } else {
            greatest = num2;
            smallest= num1;
        }

        int lcm = num1 * num2;
        for (int i = 1; i <= greatest; i++) {
            if((greatest * i) % smallest == 0) {
                lcm = greatest * i;
                break;
            }
        }

        System.out.println("The LCM of " + num1 + " & " + num2 + " is " + lcm);

        sc.close();
    }
}
