/**
 * DUGAYEN,KYLENE 
 * 7-26-2019
 * DATING SITE
 * ICT-11
 */
package pt_12_joptionpane_dugayen;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pt_12_JOPTIONPANE_DUGAYEN {
    
    
    public static void main(String[] args) {      
         Scanner master= new Scanner (System.in);
        
        String name="";
        String all="";
        
        name= JOptionPane.showInputDialog("Kindly enter your name");
        all= "Welcome "+name+ "!!!";
        
        JOptionPane.showMessageDialog(null,all);
        
        int age;
        
        age= Integer.parseInt(JOptionPane.showInputDialog("Hi "+name+" please enter your age"));
               
        String q=("Welcome to ICT Dating Site "+name);
        String g=("Sorry you're not allowed to enter since you're too young "+name);
           
        String o=(age>18)?q:g;   
        
        JOptionPane.showMessageDialog(null,o);
        
        
        
       
        
        
    
    }
    
}
