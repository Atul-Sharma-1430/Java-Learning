import java.util.Scanner;

class SwapTwoNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:- ");
        int number1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int number2 = sc.nextInt();

        System.out.println("Number Before Swaping:- ");
        System.out.println("Num1 = " + number1);
        System.out.println("Num2 = " + number2);


        //Method 1 using Third variable
        int num1 = number1 , num2 = number2;
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Number After Swaping using three variables:- ");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

        //Method 2 using 2 variable only
        num1 = number1; num2 = number2;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Number After Swaping using two variables:- ");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);

        sc.close();
    }
}
