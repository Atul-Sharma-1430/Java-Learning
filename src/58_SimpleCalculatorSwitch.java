import java.util.Scanner;

class SimpleCalculatorSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = calculate(num1, num2, operator);

        System.out.println("Result: " + result);

        sc.close();
    }

    public static double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b != 0) {
                    yield a / b; // use 'yield' inside block for switch expressions just works like return keyword
                                 // return Ends the entire method and returns a value from the method.
                                 // yield Ends just that case block inside a switch expression and supplies a value back to the switch

                } else {
                    System.out.println("Error: Division by zero!");
                    yield Double.NaN;
                }
            }
            default -> {
                System.out.println("Invalid operator!");
                yield Double.NaN;
            }
        };
    }
}
