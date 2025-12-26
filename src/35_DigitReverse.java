import java.util.Scanner;

class DigitReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int rev = 0;
        while(num!=0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }

        System.out.println("The number after reversing is : " + rev);
        sc.close();
    }
}
