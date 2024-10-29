
package boxdemo.java;

class BoxA{ 
        double width;
        double height;
        double depth;
        BoxA(double w, double h, double d){           
            width=w;
            height=h;
            depth=d;
        }
  double volume()  {
      return width* height* depth;
  }}

class BoxDemo7{
public static void main (String args[]){
BoxA mybox1=new BoxA (10,20,15);
BoxA mybox2=new BoxA (3,6,9);

double vol;

vol=mybox1.volume();
System.out.println("Volume is "+vol);

vol=mybox2.volume();
System.out.println("Volume is "+vol);


}}