import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set your password: ");
        String correctPassword = sc.nextLine();

        String enteredPassword;
        int i = 1;


        do {

            if( i==1 ) {
                System.out.print("Enter password to login: ");
            } else {
                System.out.print("Incorrect password..! , Enter your password again: ");
            }
            enteredPassword = sc.nextLine();

            i++;

        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted!");
        sc.close();
    }
}
