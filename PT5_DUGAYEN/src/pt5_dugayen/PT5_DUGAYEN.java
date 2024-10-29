
package pt5_dugayen;
import java.util.*;
public class PT5_DUGAYEN {

    public static void main(String[] args) {
        
        LinkedList<String> name= new LinkedList<String>();
        name.add   ("Name:      ");
        
        LinkedList<String> address= new LinkedList<String>();
        address.add ("Adress:    ");
        
        LinkedList<String> number= new LinkedList<String>();
        number.add ("Number:    ");
        
        System.out.println(name);
        System.out.println(address);
        System.out.println(number);
        System.out.println();
        System.out.println(name);
        System.out.println(address);
        System.out.println(number);        
        System.out.println();
        System.out.println(name);
        System.out.println(address);
        System.out.println(number);        
      
    }
        
       /* private static void reverse(List<String> o){
        ListIterator <String> x= o.listIterator (o.size());
        
        while (x.hasPrevious())
            System.out.printf("%s   ", x.previous());
    }*/
    
}
