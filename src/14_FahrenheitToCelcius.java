import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit Temperature: ");
        double fahrenheitTemp = sc.nextDouble();

        double celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;

        System.out.println(fahrenheitTemp + "°F is equal to " + celsiusTemp + "°C");

        sc.close();
    }
}
