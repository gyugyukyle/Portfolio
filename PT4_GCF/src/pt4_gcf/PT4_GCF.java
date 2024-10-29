
package pt4_gcf;
import java.util.*;
public class PT4_GCF {

    public static void main(String[] args) {
         System.out.println("The Greatest Factor will be"+fact(1));
                 }
         public static int fact(int w){      
         int x,y;
        
        Scanner input = new Scanner(System.in);
        
          System.out.println("Input x");
          x= input.nextInt();
          
          System.out.println("Input y");
          y= input.nextInt(); 
   
          if (y!=0){
          w=x%y ;
          return w;
          }
          else 
           return x=y;
         }
          
}

         
         
         
         
  /*
        if y = 0 then
          return x;
      else
          Call: GCD(y, x%y);
      endifint gcd(int x, int y);

  int main(){
  int a, b, g;

  printf("Enter a and b:\n");
  scanf("%d%d", &a, &b);

  //gcd
  g = gcd(a, b);

  //in case g is negative, then convert it into positive
  if(g < 0){
    g *= -1;
  }

  //output
  printf("GCD(%d, %d) = %d\n", a, b, g);
  return 0;
}

int gcd(int x, int y){
  if(y == 0) return x;
  else gcd(y, x%y);
}*/
        
   
        
        
        
        
        
        
        
        
    
    

