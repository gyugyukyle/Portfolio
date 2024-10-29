package dugayenkylene_arrlist;

import java.util.*;
public class Dugayenkylene_Arrlist {
     
    public static void main(String[] args) {
       
        String [] name={"papaya","strawberry","lemon","avocado","kiwi"};
        List<String> list= new ArrayList <String>();
        for (String a: name){
            list.add(a);
        }
        
        String [] taste ={"orange","sweet","sour","bland","weird"};
        List<String> list0= new ArrayList <String>();
        for (String b: taste){
            list0.add(b);
        }
        
        for (int i=0;i<list.size();i++){
            System.out.printf("%s   ",list.get (i));
        }
        
        editlist(list,list0);
        System.out.println();
    
     for (int i=0; i<list0.size(); i++){
     System.out.printf("%s     ",list0.get (i));        
    }
}

    public static void editlist(Collection<String> list,Collection<String>list0) {
       Iterator<String> it= list.iterator();
       while(it.hasNext()){
       if(list0.contains(it.next()))
       it.remove();

    }
    
    }
}
