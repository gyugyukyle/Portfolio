
package imageslider;

 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 class Imageslider extends JFrame { //implements ActionListener
     
ImageIcon iconz[];
JLabel skrt;
JButton forward,back;
int kyle;
public Imageslider(){
    
    super("ICON SLIDER");
    setLayout(new BorderLayout( ));
    setSize(700, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    JPanel butt=new JPanel(new FlowLayout());
   
    back=new JButton("<<");
    butt.add(back);
    //back.addActionListener(this);
    forward=new JButton(">>");
    butt.add(forward);
    //forward.addActionListener(this);
    add(butt,BorderLayout.SOUTH);
        
    iconz = new ImageIcon[4]; 
    iconz[0] = new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\cheetah-leopard-animal-big-87403.jpeg");
    iconz[1] = new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\south-china-tiger.adapt.1900.1.jpg");
    iconz[2]= new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\download.jpg");
    iconz[3]= new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\elephant-cub-tsavo-kenya-66898.jpeg");

    skrt = new JLabel("",JLabel.CENTER); 
    add(skrt,BorderLayout.CENTER);
    skrt.setIcon(iconz[0]);
    
}
public  void actionPerformed(ActionEvent abacada)
{
    if(abacada.getSource()==back)
    {
        if(kyle==0)
        {
            JOptionPane.showMessageDialog(null,"This is the first image");
        }
        else
            {
            kyle=kyle-1;
            skrt.setIcon(iconz[kyle]);
        }
    } 
    
    
    if(abacada.getSource()==forward)
    {
        if(kyle==iconz.length-1)
        {
            JOptionPane.showMessageDialog(null,"This is the last image");
        }
        else
            {
            kyle=kyle+1;
            skrt.setIcon(iconz[kyle]);
            }}}

public static void main(String args[]){
    Imageslider obj = new Imageslider();
}
 }
    
    /*package JavaDB_001;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Project extends JFrame{
    JLabel pic;
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
                      "C:/Users/samsng/Desktop/jv1.png",//0
                      "C:/Users/samsng/Desktop/jv2.jpg",//1
                      "C:/Users/samsng/Desktop/jv3.jpg",//2
                      "C:/Users/samsng/Desktop/jv4.jpg",//3
                      "C:/Users/samsng/Desktop/jv5.png",//4
                      "C:/Users/samsng/Desktop/jv6.jpg",//5
                      "C:/Users/samsng/Desktop/jv7.jpg"//6
                    };
    
    public Project(){
        super("Java SlideShow");
        pic = new JLabel();
        pic.setBounds(40, 30, 700, 300);

        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
        setLayout(null);
        setSize(800, 400);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

public static void main(String[] args){ 
      
    new Project();
}*/

