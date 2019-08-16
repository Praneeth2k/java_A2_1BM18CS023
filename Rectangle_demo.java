//Create a class Rectangle with member variables: length and width. Define member functions to take input, compute area and print area along with values of length and width. Create two objects for class //Rectangle and invoke the functions.


import java.util.*;
 
class Rectangle
{
  int length;
  int width;


  void input()
  {
   System.out.println("Enter the length and bredth of the rectangle");
   Scanner sc=new Scanner(System.in);
   length=sc.nextInt();
   width=sc.nextInt();
  }
   
   double area()
      {
       return length*width;
       }
  
   void output()
  {
   double a=area();
   System.out.println("The area of the rectangle with width "+ width +" and length "+length+" is "+a);
   }
 }

 class Rectangle_demo
 {
  public static void main(String args[])
  {
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle();
    r1.input();
    r1.output();
    r2.input();
    r2.output();
   }
 }
  
