import java.util.Scanner;

class RectanglePerimeter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle (cm): ");
        int length = sc.nextInt();

        System.out.print("Enter the width of the rectangle (cm): ");
        int width = sc.nextInt();

        int perimeter = 2 * (length + width);

        System.out.println("The perimeter of the rectangle is: " + perimeter + " cm");

        sc.close();
    }
}