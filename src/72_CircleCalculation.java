import java.util.Scanner;

class CircleCalculation {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius:");
        double radius = sc.nextDouble();

        System.out.println("Area: " + calculateArea(radius));

        System.out.println("Circumference: " + calculateCircumference(radius));

        sc.close();
    }
}
