import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " +  num2 + " = " + (num1+num2));

    }
}
