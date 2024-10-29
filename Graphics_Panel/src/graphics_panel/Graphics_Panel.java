package graphics_panel;
import java.awt.*;
public class Graphics_Panel extends Panel{
    
    Graphics_Panel(){
        setBackground(Color.CYAN);
    }
    public void paint(Graphics g){
        g.setColor(new Color(234,88,25));
        g.setFont(new Font("Bookman Old Style",Font.ITALIC|Font.BOLD,32));
        g.drawString("Hello Gui World!",30,100);
        g.setColor(new Color(1.0f,0,0));
        g.fillRect(30,100,150,10);
    }
    public static void main(String args[]){
        Frame f=new Frame("Testing Graphics Panel");
        Graphics_Panel gp = new Graphics_Panel();
        f.add(gp);
        f.setSize(600,300);
        f.setVisible(true);
    }    
    }
    

