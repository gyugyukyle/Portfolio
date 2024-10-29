package pt4_search_dugayen;
 import java.util.Scanner;     
public class Pt4_SEARCH_Dugayen {

    public static void main(String[] args) {
        //interface
      Scanner x= new Scanner (System.in);
      System.out.println("Enter a,b,c,d");
      System.out.println("Search:");
      String a = x.nextLine();//what the user entered
      String k[]={"a","a","c","d","a","d","a","b","a"};//kunwari existing list
      
          int count = 0; //counter 
          for(int i=0;i<k.length;++i)// (initialization;termination condition;increment)
          {
          if(k[i].equals(a))//equivalent value 
          count++;//increment 
          }
          System.out.println("searched:"+count);
      
    
    
    
    
    
    
     }
       
    }
    

