
package randomgame;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {

Random dice = new Random();
Scanner roll= new Scanner(System.in);
    public static void main(String[] args) {
    
     System.out.println("enter your lucky number in numbers 1-6 " +"^_^" );
     int luck = roll.nextInt();
     int number;
     
     for(int counter =1; counter<=1;counter++){
     number=1+dice.nextInt(6);
     if (number<luck){
     System.out.println("guess lower");}
     else
            if(number==luck){
            System.out.println("number "+luck+" is correct "+"your luck is strong "+"^_^"); break;}
     else
         if(number>luck){
     System.out.println("guess higher");}
          
     
     int duck = roll.nextInt();
    
      if (number<duck){
      System.out.println("guess lower");}
         else
          if(number==duck){
            System.out.println("number "+duck+" is correct "+"good job "+"-_-");break;}
     else
         if(number>duck){
     System.out.println("guess higher");}
         
      int buck = roll.nextInt();
    
      
              
          if(number==buck){
            System.out.println("number "+buck+" is correct "+"finally "+"!-_-");break;}
         else
              if(number!=buck){System.out.println("the correct number is "+number+" try again next time "+"!>#<!");}
     else
      
           if(number==buck){System.out.println("number "+buck+" is correct "+"finally "+"!-_-");break;}
      else
         if(number!=buck){System.out.println("the correct number is "+number+" try again next time "+"!>#<!");}
     }
     }
}
        
    
    
}
