
package imageslider2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Imageslider extends JFrame  implements ActionListener{
ImageIcon iconz[];
JLabel skrt;
JButton forward,back;
int kyle; 
JPanel butt=new JPanel(new FlowLayout());

public Imageslider(){
    back=new JButton("<<");
    butt.add(back);
    back.addActionListener(this);
    forward=new JButton(">>");
    butt.add(forward);
    forward.addActionListener(this);
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

}
