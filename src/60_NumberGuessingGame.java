import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1;

        int userGuess;
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            }

        } while (userGuess != numberToGuess);

        System.out.println("🎉 Congratulations! You guessed the number " + numberToGuess + " correctly!");
        sc.close();
    }
}
