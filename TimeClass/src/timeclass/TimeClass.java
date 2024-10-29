
package timeclass;

public class TimeClass {

    public static void main(String[] args) {
        
        subtimeclass obj=new subtimeclass();
        
        obj.setTime (20,7,6);
        {
            System.out.println(obj.toMilitary());
         
            System.out.println(obj.toRegular());
        } 
    }
    
}
