import java.util.*;
import java.lang.*;
abstract class Shape
{
	int a,b;
	abstract void printarea();
}
class Triangle extends Shape
{
	Scanner sc=new Scanner(System.in);
	Triangle()
	{ 	System.out.println("Enter the Base and Height:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void printarea()
	{
		System.out.println("Area of Triangle = "+(0.5*a*b)+" sq.units");
	}	
	
}

class Rectangle extends Shape
{
	
	
	Scanner sc = new Scanner(System.in);
	Rectangle()
	{
		System.out.println("Enter the Length and Breadth:");
		a = sc.nextInt();
		b = sc.nextInt();
	}
       	void printarea()
	{
		System.out.println("Area of Rectangle: "+(a*b)+" sq.units");
	}
}


class  Circle extends Shape
{
	Scanner s = new Scanner(System.in);
	Circle()
	{
		System.out.println("Enter the Radius of Circle : ");
		a = s.nextInt();	
	}
	void printarea()
	{	
		System.out.println("Area of circle: "+(3.14*a*a)+" sq.units");
	}
}


class ShapeDemo
{
	 public static void main(String args[])
	
 	{	
			Shape ref=null;         //Creating a Base class Reference
			Scanner sc=new Scanner(System.in);
			do
			{
			
			System.out.println("1:Triangle   2:Rectangle   3:Circle   4:Exit");
			System.out.println("Enter your Choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
					case 1: ref=new Triangle();//Super-class Reference pointing to sub-class object
						break;
					case 2: ref=new Rectangle();
						break;
					case 3: ref=new Circle();
						break;
	
					case 4: 
						System.exit(0);
						break;
					default: System.out.println("Invalid Choice.");
			}
			ref.printarea();
			}while(true);
	}
}

/*1:Triangle   2:Rectangle   3:Circle   4:Exit
Enter your Choice: 
1
Enter the Base and Height:
10 2
Area of Triangle = 10.0 sq.units
1:Triangle   2:Rectangle   3:Circle   4:Exit
Enter your Choice: 
2
Enter the Length and Breadth:
20 9
Area of Rectangle: 180 sq.units
1:Triangle   2:Rectangle   3:Circle   4:Exit
Enter your Choice: 
3
Enter the Radius of Circle : 
1
Area of circle: 3.14 sq.units
1:Triangle   2:Rectangle   3:Circle   4:Exit
Enter your Choice: 
4
*/
