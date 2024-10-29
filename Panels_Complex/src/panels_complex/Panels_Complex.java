
package panels_complex;
import java.awt.*;
class Panels_Complex extends Frame{
    public static void main(String[] args) {
  
    Panels_Complex cl= new Panels_Complex();
    
    Panel panelCenter= new Panel();
    Panel panelSouth= new Panel();
    Panel panelNorth= new Panel();
    panelNorth.add(new Button("ONE"));    
    panelNorth.add(new Button("TWO"));  
    panelNorth.add(new Button("THREE"));
    
    panelCenter.setLayout(new GridLayout(4,4));
    panelCenter.add(new TextField("1st"));  
    panelCenter.add(new TextField("2nd"));  
    panelCenter.add(new TextField("3rd"));
    panelCenter.add(new TextField("4th"));  
    
    panelSouth.setLayout(new BorderLayout());
    CheckboxGroup cbg =new CheckboxGroup();
    panelSouth.add(new Checkbox("Choose Me!",cbg,true), BorderLayout.CENTER);   
    panelSouth.add(new Checkbox("I'm Here!",cbg,false), BorderLayout.EAST);   
    panelSouth.add(new Checkbox("Pick Me!",cbg,false), BorderLayout.WEST);
    /*  CheckboxGroup cbg =new CheckboxGroup();
       fwc.add(new Checkbox("chk1",cbg,true));
       fwc.add(new Checkbox("chk2",cbg,false));
       fwc.add(new Checkbox("chk1",cbg,false));*/
    
    /* Checkbox checkbox1 =new Checkbox("Choose Me!",false);
    checkbox1.setBounds(100,100, 50,50);  
    Checkbox checkbox2 = new Checkbox("I'm Here!",true);  
    checkbox2.setBounds(100,150, 50,50);  
    Checkbox checkbox3 = new Checkbox("Pick Me!",false);  
    checkbox3.setBounds(100,150, 50,50);
        panelSouth.add(checkbox1);  
        panelSouth.add(checkbox2); 
        panelSouth.add(checkbox3);*/
   
    cl.add(panelNorth,BorderLayout.NORTH);
    cl.add(panelCenter,BorderLayout.CENTER);
    cl.add(panelSouth,BorderLayout.SOUTH);
    cl.setSize(300,300);
    cl.setVisible(true);
    
    
    }

    }
    
