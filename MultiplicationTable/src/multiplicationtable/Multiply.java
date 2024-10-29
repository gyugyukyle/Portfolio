
package multiplicationtable;

import java.awt.*;
import javax.swing.*;

public class Multiply extends JFrame {
 private JButton item,array;
    public Multiply(){
        super ("Multiplication Table");
        setLayout(new FlowLayout());
        item=new JButton ("Multiplication Table");
        int[][]a=new int[11][11];
       
        for(int b=1;b<a.length;b++){
        for (int y=1;y<a.length;y++){
        array=new JButton(a[b][y]+(b*y)+ " " +"\n");
        add(array); 
        
    }  
         
        
    }
        item.setToolTipText("This is a Multiplication Table");
        add (item);
        
    } 


  
} 
