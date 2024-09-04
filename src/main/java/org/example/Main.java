package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        class NumberGuessingGame {
            private int numberToGuess;
            private int attempts;

            public NumberGuessingGame() {
                this.numberToGuess = new Random().nextInt(100) + 1;
                this.attempts = 0;
            }

            public String guessNumber(int guess) {
                attempts++;
                if (guess < numberToGuess) {
                    return "Too low!";
                } else if (guess > numberToGuess) {
                    return "Too high!";
                } else {
                    return "Correct! You guessed it in " + attempts + " attempts.";
                }
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                NumberGuessingGame game = new NumberGuessingGame();
                int guess = -1;

                System.out.println("Guess the number (1-100):");

                while (guess != game.numberToGuess) {
                    System.out.print("Your guess: ");
                    guess = scanner.nextInt();
                    System.out.println(game.guessNumber(guess));
                }

                scanner.close();
            }
        }


    }
}