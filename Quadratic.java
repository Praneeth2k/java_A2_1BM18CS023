import java.util.*;
class Quadratic
{
   public static void main(String args[])
  {
    System.out.println("Enter the values of a,b and c");
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    int d=b*b-4*a*c;
    
   if(d>0)
    {
     double r1=(-b+Math.sqrt(d))/(2*a);
     double r2=(-b-Math.sqrt(d))/(2*a);
    System.out.println("The roots are "+r1+"and"+r2);
    }
    else if(d==0)
    {
    float r1=-b/(2*a);
    System.out.println("The roots are real and equal and the root is"+r1);
    }
    else
    System.out.println("The roots are imaginary");  
  }
}
