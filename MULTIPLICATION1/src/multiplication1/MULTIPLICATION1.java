
package multiplication1;
import java.awt.*;
import javax.swing.*;
class MULTIPLICATION1 extends Frame {

    public static void main(String[] args) {
        
        int tableSize = 9;
        printMultiplicationTable(tableSize);
      }     
public MULTIPLICATION1(){
    super ("Multiplication Table");
}
    public static void printMultiplicationTable(int tableSize) {       
       MULTIPLICATION1 gld= new MULTIPLICATION1 ();
       int[][]a=new int[11][11];
       for(int b=1;b<a.length;b++){
       for (int y=1;y<a.length;y++){
       gld.setLayout(new GridLayout(11,11));
       gld.add(new TextField(a[b][y]+(b*y)+ "  "));
       gld.setSize(520,520);
       gld.setVisible(true);  
      
       
       /*System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");
         
        for(int i = 1 ;i<=tableSize;i++) {
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }*/
        
       
       /* public JButton item,array;
        
        int[][]a=new int[11][11];
         
        for(int b=1;b<a.length;b++){
        for (int y=1;y<a.length;y++){
        array=new JButton(a[b][y]+(b*y)+ " " +"\n");
        add(array); 
        
      
         
        }     
    
        item.setToolTipText("This is a Multiplication Table");
        add (item);
        */
         
        
        
        
        
        
        
        
    }
    
}}}
