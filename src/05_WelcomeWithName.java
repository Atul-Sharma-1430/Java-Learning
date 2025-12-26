import java.util.Scanner;

class WelcomeWithName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name please..!! :- ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " from Atul Sharma");
        sc.close();
    }
}
