
package guisample;
import javax.swing.JFrame;
public class GuiSample {
    public static void main(String[] args) {
        
        Guisubclass obj= new Guisubclass ();
        obj.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        obj.setSize (250,350);
        obj.setVisible(true);
    }
    
}
