/**
 * DUGAYEN,KYLENE 
 * 7-25-2019
 * DATING SITE
 * ICT-11
 */
package pt11_datingsite_dugayen;

 import java.util.Scanner;
public class Pt11_DATINGSITE_DUGAYEN {
    
    public static void main(String[] args) {
        
       Scanner master= new Scanner (System.in);
       
        System.out.println("ICT DATING SITE");
        
        int age;
        String name="";
        String all="";
 
        System.out.println("Kindly enter your name"+ name);
        name= master.nextLine();        
        
        System.out.println("Welcome "+name);
    
        System.out.println("Enter your age");
        age =master.nextInt();
        
        all =(age >= 18)?"Welcome to ICT Dating Site "+name :"Sorry you're not allowed to enter since you're too young "+name;
        
        System.out.println(all);
       
            
   
        
        
        
     
        
        
    }
    
}
