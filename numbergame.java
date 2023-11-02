import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println(" Number Guessing Game!");

        while (true) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("Round " + (rounds + 1));
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println(" You've guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                if (attempts == maxAttempts) {
                    System.out.println(" you've run out of attempts. The correct number was " + numberToGuess + ".");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
            rounds++;
        }

        System.out.println("Game over. You played " + rounds + " rounds and your total score is " + score);
    }
}
