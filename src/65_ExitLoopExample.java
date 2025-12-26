import java.util.Scanner;

class ExitLoopExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Type something (type 'exit' to quit):");

        while (true) {
            System.out.print("Enter input: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exit keyword entered. Breaking the loop.");
                break;
            }

            System.out.println("You entered: " + input);
        }

        sc.close();
    }
}

