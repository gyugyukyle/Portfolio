   package randomgame;

import java.util.Random;
import java.util.Scanner;

public class RandomGame1 {

    public static void main(String[] args) {
    
     Random x = new Random();
     Scanner input = new Scanner(System.in);
   
     System.out.println("You have 10 tries to guess a number between 1 and 10");
     
     int counter=1;
     int random=1+x.nextInt(10);
     int num;
     
    while (counter <= 10) {
            System.out.print("Guess number " + counter + ": ");
            num =input.nextInt();
    
            if (num<random){
            System.out.println("Try again and guess higher");}
            
            else if(num>10){
                System.out.println("Guesses should be between 1 and 10");
            }
            else if(num>random){
            System.out.println("Try again and guess lower");
            }
            
            else if(num==random){
            System.out.println("Your guess is right. Play again?");
            
            break;
            }
            counter++;
         }
    
    if (counter > 10) {
        System.out.println("Sorry, you did not guess the number in 10 trials");
        System.out.println("The number was " + random);
    }
          
    
    
    }}

    
  /*  Random x = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your guess value from 1-100 ");
        Random generator = new Random();
        int numberToGuess = 1 + generator.nextInt(100);
        int numberOfTries = 1;
        int limit = 10;
        int guess;
        
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

        //break to end while loop
        break;
    }
    numberOfTries++;*/

       /* while (i<15){
        if (guess == 15)
        System.out.println("Your luck has run out. Play again?"); }
        
        if (guess < num){
            System.out.println("Try again and guess higher."); 
        }
        
        else if (guess > num )
        System.out.println("Try again and guess lower.");
        
        if (guess == num){
        System.out.println("Your guess is right. Play again?");   
        }
        
    }*/
       /*Random generator = new Random();

//import the scanner for prompt
Scanner input = new Scanner(System.in);

//integers for the secret number, input guess of the secret number, tries and limit to tries
int numberToGuess = 1 + generator.nextInt(100);
int numberOfTries = 1;
int limit = 10;
int guess;

//prompt user to enter a number to guess
System.out.println("You have 10 tries to guess a number between 1 and 100");

//start of while loop
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

        //break to end while loop
        break;
    }
    numberOfTries++;

    // If statement after executing the while loop the output if user loses and answer to secret number
    if (numberOfTries > 10) {
        System.out.println("Sorry, you did not guess the guess the answer in 10 tries");
        System.out.println("The number was " + numberToGuess);
    }
}`*/
    


    
    
    
    

