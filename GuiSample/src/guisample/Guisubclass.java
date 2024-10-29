
package guisample;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
public class Guisubclass extends JFrame{
    
    private final JButton item;
    public Guisubclass(){
        super ("Hello World");
        setLayout(new FlowLayout());
        item=new JButton ("Hi there fellow human being");
        item.setToolTipText("This is a greeting");
     add (item);
    }}

   
