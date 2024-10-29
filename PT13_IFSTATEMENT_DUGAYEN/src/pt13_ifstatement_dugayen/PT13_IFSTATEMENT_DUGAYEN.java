/**
 * DUGAYEN,KYLENE 
 * 8-2-2019
 * ICT-11
 */
package pt13_ifstatement_dugayen;


import javax.swing.JOptionPane;
public class PT13_IFSTATEMENT_DUGAYEN {

    public static void main(String[] args) {
        
        int x = 0;
        
        x=Integer.parseInt(JOptionPane.showInputDialog("Enter grade"));
        
        if (x==100){                   
             JOptionPane.showMessageDialog(null,"Excellent");
        } else if (x>=90 )
             JOptionPane.showMessageDialog(null,"Very Good");  
        if (x>=89){           
              JOptionPane.showMessageDialog(null,"Good Job");            
        } else if (x<=80)
            JOptionPane.showMessageDialog(null,"Good");  
        if (x<=70){        
            JOptionPane.showMessageDialog(null,"Wag na tayong mag-aral uwi na tayo");
        }
                
       
       
           
        
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
