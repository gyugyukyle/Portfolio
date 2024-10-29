/**
 * DUGAYEN,KYLENE 
 * 8-2-2019 
 * ICT-11
 */
package bonus_dugayen;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bonus_Dugayen {

    public static void main(String[] args) {
    Scanner master= new Scanner (System.in);
    
        int bonus=1000;
        int salary=0;
        String name="";
        
        
        name=JOptionPane.showInputDialog("Enter Name");
        salary=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary"));
        
        if (salary<1000){
            String hakdug=(name+" receives bonus of "+ salary*0.50+" bonus");
             JOptionPane.showMessageDialog(null,hakdug);
        }else if(salary>1000)
        {
           String hh=(name+" receives 1000 Pesos as a bonus");
           JOptionPane.showMessageDialog(null,hh);
        }
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
    
}
