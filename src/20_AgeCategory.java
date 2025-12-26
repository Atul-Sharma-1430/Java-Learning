import java.util.Scanner;

class AgeCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Please enter a valid age.");
        } else if (age >= 60) {
            System.out.println("Category: Senior");
        } else if (age >= 20) {
            System.out.println("Category: Adult");
        } else if (age >= 13) {
            System.out.println("Category: Teen");
        } else {
            System.out.println("Category: Child");
        }

        sc.close();
    }
}
