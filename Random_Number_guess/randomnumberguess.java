import java.util.Scanner;

import java.util.Random;

public class randomnumberguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int numberOfAttempts = 8; // You can adjust this as needed
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("I have generated a random number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + numberOfAttempts + " attempts to guess the correct number.");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            while (attempts < numberOfAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    System.out.println("no of attempts you took : "+ attempts);
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts > numberOfAttempts) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Game over! number of rounds you won : " + score);
        scanner.close();
    }
}
