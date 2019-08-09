import java.util.*;
class Fibonacci
{
  public static void main(String args[])
  {
    System.out.println("Enter the number of terms you want");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.print("The numbers are");
    System.out.print("0 ");
    fibonacci(n);
   } 
    static void fibonacci(int n)
    {
     int counter=0;
     int prev=0;
     int t=1;
     int last;
     
     while(counter<n-1)
     {
      System.out.print(t+" ");
      last=prev;
      prev=t;
      t=t+last;
    
      counter++;
     } 

    }    
   
}   
     
    
  

