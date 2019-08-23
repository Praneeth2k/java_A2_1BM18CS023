import java.util.*;
public class Time {
    int h;
    int m;
    int s;
    
    Time(){
        h=0;m=0;s=0;
    }
    
    Time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    
    void current_Time(int h,int m,int s){
        this.h=h;this.m=m;this.s=s;
    }
    
    void advance(int a,int b,int c){
        s=s+c;
        m=m+b+s/60;
        s=s%60;
        h=h+a+m/60;
        m=m%60;
        h=h%24;
    }
    
    void print(){
        System.out.println("The time is "+h+":"+m+":"+s);
    }
    
}
public class Time_Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Time t=new Time();
        while(true){
        System.out.println("Enter 1 to set current time and 2 to advacnce time and 3 to exit");
        int x=sc.nextInt();
        switch(x){
            case 1:System.out.println("Enter hours,minutes and seconds");
                    int hh=sc.nextInt();
                    int mm=sc.nextInt();
                    int ss=sc.nextInt();
                    
                    t.current_Time(hh,mm,ss);
                    t.print();
                    break;
            case 2: System.out.println("Enter hours,minutes,seconds by which the time needs to be advanced");
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    t.advance(a,b,c);
                    t.print();
                    break;
            case 3: return;  
            default:System.out.println("Invalid Input");
        }
      }
            
    }
 }