import java.util.*;
public class Point {
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
public class PointDemo {
    public static void main(String args[]){
        Point p1=new Point();
        Point p2=new Point(3,4);
        Point p3=new Point(p2);
        Point p4=new Point(6,8);
        
        System.out.println("Distance between point p1 and p2 is "+p1.Dist(p2));
        System.out.println("Distance between point p2 and p2 is "+p2.Dist(p3));
        System.out.println("Distance between point p2 and p4 is "+p2.Dist(p4));
    }
        

}