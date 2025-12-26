package Question_77.Geometry;

import Question_77.Utils.Calculator;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        Calculator calculator = new Calculator();

        System.out.printf("The Area of Circle is: %.2f" , calculator.circleArea(radius));

        sc.close();
    }
}
