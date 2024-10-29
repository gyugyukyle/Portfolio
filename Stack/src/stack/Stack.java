package stack;
import java.util.*;
public class Stack {

    public static void main(String[] args) {
         Stack<String> mystack = new Stack<String>();
       
        mystack.push("1");
        printStack(mystack);
        mystack.push("2");
        printStack(mystack);
        mystack.push("3");
        printStack(mystack);
        
        mystack.pop();
        printStack(mystack);
        mystack.pop();
        printStack(mystack);
        mystack.pop();
        printStack(mystack);
        
    }
    private static void printStack (Stack<String> s){
        if(s.isEmpty())
            System.out.println("null");
        else
            System.out.printf("%s Top\n",s);
        
        
        
      
    }
    
}
