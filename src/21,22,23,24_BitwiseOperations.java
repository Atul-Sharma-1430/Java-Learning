import java.util.Scanner;

class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Bitwise AND
        int andResult = num1 & num2;
        System.out.println("Bitwise AND (num1 & num2): " + andResult);

        // Bitwise OR
        int orResult = num1 | num2;
        System.out.println("Bitwise OR (num1 | num2): " + orResult);

        // Bitwise XOR
        int xorResult = num1 ^ num2;
        System.out.println("Bitwise XOR (num1 ^ num2): " + xorResult);

        // Bitwise NOT
        int notNum1 = ~num1;
        int notNum2 = ~num2;
        System.out.println("Bitwise NOT (~num1): " + notNum1);
        System.out.println("Bitwise NOT (~num2): " + notNum2);

        sc.close();
    }
}
