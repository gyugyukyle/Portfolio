package push_and_pop;
class Stack{
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
} 
  
/*import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class push extends JFrame{
private JButton item, pop;
public push(){
 super ("Push and pop");
 setLayout(new FlowLayout());*/
 
 
 
 
 
 
 
 
 
 
 
 /*int pp[]={1,2,3,4,5,6,7,8,9,10};
 int x;
 
        for (int i=0; i<pp.length; i++){
            x=pp[i];
             pop= new JButton (x);
             add(pop);
        }
 
  item=new JButton ("push and pop");
  add (item);
 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
}
