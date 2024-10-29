
package boxdemo.java;
 class Box{ 
        double width;
        double height;
        double depth;
        Box(){
            System.out.println("Constructing Box");
            width=10;
            height=10;
            depth=10;
        }
  double volume()  {
      return width* height* depth;
  }
  void setDim (double w, double h, double d){
      width=w;
      height=h;
      depth=d;
  }
  }
class BoxDemo {
    public static void main(String[]args){
        Box mybox= new Box();
        double vol;
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
         vol=mybox.width*mybox.height*mybox.depth;
         System.out.println("Volume is "+ vol);
                
                
                
    }
}