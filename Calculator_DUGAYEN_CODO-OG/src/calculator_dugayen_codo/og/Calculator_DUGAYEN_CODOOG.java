/*
8-27-2019
ICT-11
PERFORMANCE TASK
 */
package calculator_dugayen_codo.og;
import java.util.Scanner;       
import static jdk.nashorn.tools.ShellFunctions.input;
public class Calculator_DUGAYEN_CODOOG {

    public static void main(String[] args) {     
        
        //choices
       //char choice;
    
        
        Scanner hakdoog = new Scanner(System.in);
        System.out.print("CHOOSE:");
        hakdoog.nextLine();
        
        System.out.println("A. Binary");
        System.out.println("B. Octal");
        System.out.println("C. Hexa");
        
        Scanner input=new Scanner(System.in);
        char choice = input.next().charAt(0);
        //DEC TO BINARY  
        
        if (choice== 'A'||choice=='a'){
       
        {
            
        //declaring
        int n, a; 
        String x = "";//holder for binary 
        //user interface
        Scanner master = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        n=master.nextInt();//holder for what the user entered 
        //solution, formula and cycle
        while(n > 0)//for looping
        {
            a = n % 2;//we use modulo to compute for the remainder
            if(a == 1)//If the int we declared will have a modulo then it will be equal to 1 in our binary. 
            {
            }
            x = a + "" + x;//and so the x will be the holder to what 'a' has and will hold the binary code 
            n = n / 2;//and so the entered value will be divided by 2 and will continue to do so to get the modulo
        }
        System.out.println("Binary:"+x);
       
        //DEC TO OCT
        choice=input.next().charAt(0);
        if (choice== 'B'||choice=='b'){
        {
        int m;
        String s=""; 
        System.out.print("Enter any decimal number:");
        n=master.nextInt();
        char dig[]={'0','1','2','3','4','5','6','7'};
         while(n>0)
        {
        m=n%8; 
        s=dig[n]+s; 
        n=n/8;
        }
        System.out.println("Octal:"+s);
        
        //DEC TO HEXA
        choice=input.next().charAt(0);
        if (choice== 'C'||choice=='c') {
        }
        int v;
        String e="";
        System.out.println("Enter any decimal number:");
        n=master.nextInt();
        }
                    
        }        
     
       
        
      
        
        
        
    }
}
        

    

