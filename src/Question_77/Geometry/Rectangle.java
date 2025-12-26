package Question_77.Geometry;

import Question_77.Utils.Calculator;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        System.out.print("Enter the Breadth: ");
        int breadth = sc.nextInt();

        Calculator calculator = new Calculator();

        System.out.printf("The Area of Rectangle is: %.2f", calculator.rectangleArea(length, breadth));

        sc.close();
    }
}
