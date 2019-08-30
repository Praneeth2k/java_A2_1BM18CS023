import java.util.*;
class Point {
    private int x,y;
    
    Point(){x=0;y=0;}
    
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    Point(Point ob){
        x=ob.x;
        y=ob.y;
    }
    
    double Dist(Point ob){
        double d=Math.pow(x-ob.x,2)+Math.pow(y-ob.y,2);
        return Math.sqrt(d);
    }
}
class PointDemo {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int x;
    do{
	System.out.println("Enter the x and y co-ordinates of the first point");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter the x and y co-ordinates of the second point");
        int x2=sc.nextInt();
        int y2=sc.nextInt(); 
        Point p=new Point();
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);
        
        System.out.println("Distance between the two points is "+p1.Dist(p2));
        System.out.println("Distance between first point and the origin is "+p.Dist(p1));
        System.out.println("Distance between second point from the origin is "+p.Dist(p2));
      System.out.println("Do you want to try again 1/0");
      x=sc.nextInt();
      }while(x!=0);


 
    }
        
}
/*OUTPUT
Enter the x and y co-ordinates of the first point
3 4
Enter the x and y co-ordinates of the second point
6 8
Distance between the two points is 5.0
Distance between first point and the origin is 5.0
Distance between second point from the origin is 10.0
Do you want to try again 1/0
1
Enter the x and y co-ordinates of the first point
5 4
Enter the x and y co-ordinates of the second point
1 2
Distance between the two points is 4.47213595499958
Distance between first point and the origin is 6.4031242374328485
Distance between second point from the origin is 2.23606797749979
Do you want to try again 1/0
0
*/
