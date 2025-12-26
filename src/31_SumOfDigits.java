import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int originalNum = sc.nextInt();

        int sum = 0 , num = originalNum;
        while (num!=0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }

        System.out.println("The sum of all digits of " + originalNum + " is " + sum);

        sc.close();
    }
}
