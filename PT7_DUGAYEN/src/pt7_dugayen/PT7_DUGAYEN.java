
package pt7_dugayen;

/**
 * DUGAYEN,KYLENE 
 * 7-22-2019
 * COMPUTER PROGRAMMING
 * ICT-11
 */
public class PT7_DUGAYEN {

    public static void main(String[] args) {
        //greatest
        
        int num1= 1000;
        int num2= 50;
        int num3= 900;
        int status= 0;
        int status1=0;
        
        
  System.out.println("num1 = "+ num1);
  System.out.println("num2 = "+ num2);  
  System.out.println("num3 = "+ num3);  
   
    status = (num1> num2)? num1:num2;
    status = (status>num3)? status:num3;
   
    
    System.out.println("greatest number="+ status);
           
           
           
           
           
  
        
    }
    
}
