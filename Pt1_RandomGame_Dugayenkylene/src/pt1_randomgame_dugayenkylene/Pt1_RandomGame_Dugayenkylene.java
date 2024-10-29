/*
11-7-2019
Dugayen
11-ICT
 */
package pt1_randomgame_dugayenkylene;

import java.util.Random;
import java.util.Scanner;

public class Pt1_RandomGame_Dugayenkylene {
    public static void main(String[] args) {
       
        Random num = new Random();
        Scanner input = new Scanner(System.in);
        
        int random = 1 + num.nextInt(100);
        int repeat = 1;
        int limit = 10;
        int guess;

        System.out.println("You have 10 tries to guess a number between 1 and 100");
       
    while (repeat <=20) {
    System.out.print("Guess number " + repeat + ": ");
    guess = input.nextInt();
    
    if (guess < random)
        System.out.println("Try again and guess higher");
    else if (guess > 100)
        System.out.println("Guesses should be between 1 and 100");
    else if (guess > random)
        System.out.println("Try again and guess lower");
    else if (guess == random) {
        System.out.println("Congratulations! You have correctly guess the number in " + repeat + " tries");
        break;
    } else {
        System.out.println("Sorry, you did not guess the guess the answer in 10 tries");
        System.out.println("The number was " + random);

        break;
    }
   
    repeat++;   
        
    /*if (repeat > 10) {
        System.out.println("Sorry, you did not guess the number in 10 trials");
        System.out.println("The number was " + random);
      
    }*/
    
    }
    
    } }
