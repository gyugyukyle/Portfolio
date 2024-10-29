/**
 * DUGAYEN,KYLENE 
 * 8-2-2019
 * ICT-11
 */
package pt13_if_statement_dugayen;


import javax.swing.JOptionPane;
public class PT13_IF_STATEMENT_DUGAYEN {

    public static void main(String[] args) {
    
     
     
       int x = 0;
       String y="";
        
      x=Integer.parseInt(JOptionPane.showInputDialog("Enter grade"));
      
      if (x==100){
          y="Excellent";
      }else
      if (x>=90){
          y="Very Good";
      }
      if (x>=89){
          y="Good Job";
       }else 
      if(x<=80){
          y="Good";
                  }
      if (x<=70){
          y="Wag na tayong mag-aral uwi na tayo";
                  }
         JOptionPane.showMessageDialog(null,y);
      
      }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    

