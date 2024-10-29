
package randomgame_galliguez;

/**
 *FIRST PERFORMANCE TASK
 * GALLIGUEZ, MARY JOYCE ANN V.
 */
import java.util.Random;
import java.util.Scanner;
public class RandomGame_Galliguez {

    public static void main(String[] args) {
        Random number = new Random();
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your guess value from 1-1000 ");
        for (int again =0; again <=5; again++){
            int num = 1 + number.nextInt(1000);
            if (again ==5)
          System.out.println(" but you can't enter already ");  
        
        int guess = scan.nextInt();
             
        if (guess <= 250){
            System.out.println("try again and guess higher "); //300
        }
        
        else if (guess > 300 )
        System.out.println(" try again and guess lower ");
        
        if (guess == 300){
        System.out.println(" Your guess is right, CONGRATULATIONS!! ");   
        }
        
    }
    }
}
