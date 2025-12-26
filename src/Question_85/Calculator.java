package Question_85;

import java.util.Scanner;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2+ num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 1st number:");
        int num2 = sc.nextInt();
        System.out.println("Enter 1st number:");
        int num3 = sc.nextInt();

        Calculator cal = new Calculator();
        System.out.println(cal.add(num1, num2));
        System.out.println(cal.add(num1, num2));
        System.out.println(cal.add(num1, num2, num3));
        System.out.println(cal.add(num1, num2, num3));

        sc.close();
    
    }
 
}
