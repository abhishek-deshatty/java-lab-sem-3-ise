import java.util.Scanner;
import java.lang.Math;
class Circle{
   double radius;
   Circle(double r){
      radius = r;
   }
   double Carea(){
      return Math.PI*radius*radius;
   }
}
class Sector extends Circle{
   double angle; //To be taken in radians
   Sector(double r,double a){
      super(r);
      angle = a;
   }
   double Scarea(){
      return (0.5*radius*radius*angle);
   }
}
class Segment extends Circle{
   double length;
   Segment(double r,double l){
      super(r);
      length = l;
   }
   double Sgarea(){
   // r2*((r-h)/r) – (r-h) (2rh-h2)1/2
         return (((radius*radius)*((radius-length)/radius)) -
            ((radius-length)*Math.sqrt((2*radius*length)-(length*length))));
   }
 }
 class inheritance{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("1. Area of circle");
      System.out.println("2. Area of sector");
      System.out.println("3. Area of segment");
      System.out.println("4. Exit!");
      while(true){
         System.out.println("Enter your choice");
         int ch = sc.nextInt();
         switch(ch){
            case 1:System.out.println("Enter the radius of the circle");
                  double r = sc.nextDouble();
                  Circle c = new Circle(r);
                  System.out.println("The area of the circle with radius "+r+ " is "+c.Carea());
                  break;
            case 2:System.out.println("Enter the radius of the circle");
                  r = sc.nextDouble();
                  System.out.println("Enter the sector angle in degrees");
                  double d = sc.nextDouble();
                  double p = (Math.PI/180)*d;
                  Sector s = new Sector(r,p);
                  System.out.println("The area of the sector with radius "+r+ " and sector angle "+ d+"(degrees) is "+s.Scarea());
                  break;
            case 3:System.out.println("Enter the radius of the circle");
                  r = sc.nextDouble();
                  System.out.println("Enter the length of the segment");
                  double l = sc.nextDouble();
                  Segment se = new Segment(r,l);
                  System.out.println("The area of the segment with radius "+r+ " and segement length "+ l+" is "+se.Sgarea());
                  break;
            case 4:System.exit(0);
                  break;
            default:System.out.println("Invalid choice");
         }
      }
   }
}