
package multiplication;
public class Multiplication {
    public static void main(String[] args) {
        
        
        int[][]a=new int[11][11];
        
        for(int b=1;b<a.length;b++){
        for (int y=1;y<a.length;y++){
        System.out.print(a[b][y]+(b*y)+""+"\t");
    }
        System.out.println("");
    }
    

}}