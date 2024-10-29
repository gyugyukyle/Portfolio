package iconslider;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class IconSlider extends JFrame implements ActionListener{
    
    //public static void main(String[] args) {
     JPanel add;
     JButton back,forward;
     ImageIcon iconz[];
     int kyle;
     JLabel labelz;
     
public IconSlider( ) {
    
    super("ICON SLIDER");
    setLayout(new BorderLayout( ));
    JPanel butt=new JPanel(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(700, 600);
    setVisible(true);
    back=new JButton("<<");
    forward=new JButton(">>");
    butt.add(back);
    butt.add(forward);
    add(butt,BorderLayout.SOUTH);
    
    
    iconz= new ImageIcon[4];
    iconz[0]= new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\cheetah-leopard-animal-big-87403.jpeg");
    iconz[1]= new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\south-china-tiger.adapt.1900.1.jpg");
    iconz[2]= new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\download.jpg");
    iconz[3]=new ImageIcon("C:\\Users\\Students\\Documents\\NetBeansProjects\\IconSlider\\src\\iconslider\\elephant-cub-tsavo-kenya-66898.jpeg");
    
    labelz=new JLabel("",JLabel.CENTER);
    add(labelz,BorderLayout.CENTER);
    labelz.setIcon(iconz[kyle]);
    
    back.addActionListener(this);
    forward.addActionListener(this);
    
    
    }

    private void ActionPerformed(ActionEvent c) {
        if(c.getSource()==back)
    {
        if(kyle==0)
        {
            JOptionPane.showMessageDialog(null,"This is the first image");
        }
        else
            {
            kyle=kyle-1;
            labelz.setIcon(iconz[kyle]);
        }
    }
       
    
    }
    
    private void ActionPerformed1(ActionEvent d) {
    

        if(d.getSource()==forward)
    {
        if(kyle==iconz.length -1)
        {
            JOptionPane.showMessageDialog(null,"This is the last image");
        }
        else
            {
            kyle=kyle+1;
            labelz.setIcon(iconz[kyle]);
            }
        }
}


   
 public static void main(String[] args) {  
        IconSlider obj = new IconSlider();
 
 }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

