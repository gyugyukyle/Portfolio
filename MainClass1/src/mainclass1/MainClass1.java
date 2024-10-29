package mainclass1;
import java.util.Scanner;
public class MainClass1 {

    public static void main(String[] args) {
  
        Scanner input=new Scanner (System.in);
        SubclassHakdug object= new SubclassHakdug ();
        
        System.out.println("Enter your name ");
        String name=input.nextLine();
        object.simpleMethod(name);
   /*SubclassHakdug four= new SubclassHakdug();
   four.five();*/
    
    
    
    }
    
}
