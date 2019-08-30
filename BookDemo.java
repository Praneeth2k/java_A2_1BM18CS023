import java.util.*;
class Book{
    String name,author;
    int num_pages;
    double price;

    Book(String name,String author,double price,int pgs){
    	this.name=name;
        this.author=author;
        this.num_pages=pgs;
        this.price=price;
    }
    void Display(int i){
       
        System.out.println("\nThe details of the book "+(i+1)+" are");
        System.out.println("Name:"+name+"\nAuthor:"+author+"\nNumber of pages:"+num_pages+"\nPrice:"+price);
    }

    public String toString()
    {
     String s="Name:"+name+",Author:"+author+",Number of pages:"+num_pages+",Price"+price;
     return s;
    }
}
class BookDemo{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books");
        int n=sc.nextInt(); 	
	Book arr[]=new Book[n];
        for(int i=0;i<n;i++)
        {
          System.out.println("\nBook "+(i+1));
          System.out.println("Enter the name of the book");
          String name=sc.next();
          System.out.println("Enter the author's name");
          String author=sc.next();
          System.out.println("Enter the price of the book");
          double price=sc.nextDouble();
          System.out.println("Enter the total number of pages");
          int num_pages=sc.nextInt();
          arr[i]=new Book(name,author,price,num_pages);
          System.out.println(arr[i]);
       }
       
       for(int i=0;i<n;i++)
        arr[i].Display(i);
     }
}
/*OUTPUT
Enter the number of books
2

Book 1
Enter the name of the book
ShutterIsland
Enter the author's name
leoDe
Enter the price of the book
39.99
Enter the total number of pages
200
Name:ShutterIsland,Author:leoDe,Number of pages:200,Price39.99

Book 2
Enter the name of the book
DoWeExist??
Enter the author's name
pewdiepie
Enter the price of the book
399
Enter the total number of pages
100
Name:DoWeExist??,Author:pewdiepie,Number of pages:100,Price399.0

The details of the book 1 are
Name:ShutterIsland
Author:leoDe
Number of pages:200
Price:39.99

The details of the book 2 are
Name:DoWeExist??
Author:pewdiepie
Number of pages:100
Price:399.0
*/

    	
   
