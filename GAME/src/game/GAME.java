
package game;

import java.util.Random;
import java.util.Scanner;

public class GAME {

public static void main(String[] args) {
Random num = new Random();

Scanner input = new Scanner(System.in);

int numberToGuess = 1 + num.nextInt(100);
int numberOfTries = 1;
int limit = 20;
int guess;

System.out.println("You have 10 tries to guess a number between 1 and 100");

while (numberOfTries <= 10) {
    System.out.print("Guess number " + numberOfTries + ": ");
    guess = input.nextInt();
    //if else statements (outputs)
    if (guess < numberToGuess)
        System.out.println("Your guess is too low. Try again.");
    else if (guess > 100)
        System.out.println("Guesses should be between 1 and 100.");
    else if (guess > numberToGuess)
        System.out.println("Too high. Try again.");
    else if (guess == numberToGuess) {
        System.out.println("Congratulations! You have correctly guess the number in " + numberOfTries + " tries");
        System.exit(0);
    } else {
        System.out.println("Sorry, you did not guess the guess the answer in 10 tries");
        System.out.println("The number was " + numberToGuess);

        break;
    }
    numberOfTries++;

    // If statement after executing the while loop the output if user loses and answer to secret number
    if (numberOfTries > 10) {
        System.out.println("Sorry, you did not guess the guess the answer in 10 tries");
        System.out.println("The number was " + numberToGuess);
    }
}
    }
    
}
