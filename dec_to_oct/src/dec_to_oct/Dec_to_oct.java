
package dec_to_oct;
import java.util.Scanner;      
public class Dec_to_oct {

    public static void main(String[] args) {
     
        int m,n;
        String s=""; 
        Scanner master = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        n=master.nextInt();
        char dig[]={'0','1','2','3','4','5','6','7'};
         while(n>0)
        {
        m=n%8; 
        s=dig[n]+s; 
        n=n/8;
        }
        System.out.println("Octal:"+s);
        
        
        
        
        
        
        
        
    }
    
}
